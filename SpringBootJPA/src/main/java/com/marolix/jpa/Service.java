package com.marolix.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Table;

@org.springframework.stereotype.Service(value = "service")
public class Service {

	@Autowired
	private Repo repo;

	public String insertEntity(Entity ent) {
		repo.save(ent);
		return "inserted successfully";
	}

	public Entity readEntity(Entity ent) {
		Optional<Entity> op = repo.findById(ent.getId());
		if (op.isPresent())
			return op.get();
		else

			return null;
	}

	public Entity updateRecord(String name, Integer id) {
		Optional<Entity> op = repo.findById(id);
		if (op.isPresent()) {
			Entity en = op.get();
			en.setName(name);
			repo.save(en);
			return en;
		} else
			throw new RuntimeException("There is no Id found...");
	}

	public void deleteRecord(Integer id) {
		Optional<Entity> op = repo.findById(id);
		Entity e = op.orElseThrow(() -> new RuntimeException("There is no Id found..."));
		repo.delete(e);
		System.out.println("Delete successfully...");
	}

	public List<Entity> readAllEntities() {
		Iterable<Entity> it = repo.findAll();
		List<Entity> l = new ArrayList<Entity>();
		for (Entity i : it) {
			l.add(i);
		}
		return l;
	}

	public List<Entity> readAll(Set<Integer> s) {
		Iterable<Entity> it = repo.findAllById(s);
		List<Entity> li= new ArrayList<>();
		for (Entity i : it) {
			li.add(i);
		}
		return li;
	}
	
	public void deleteAll() {
		repo.deleteAll();
		System.out.println("Deleted all Entities....");
	}
	
	

}
