package com.marolix.jpa;

import jakarta.persistence.Id;
import jakarta.persistence.Table;


@jakarta.persistence.Entity
@Table(name="entity_demo")
public class Entity {
	public Entity() {
		super();	
	}

	@Id
	private Integer id;
	private String name;
	private String phnno;
	
	
	public Entity(Integer id, String name, String phnno) {
		super();
		this.id = id;
		this.name = name;
		this.phnno = phnno;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", phnno=" + phnno + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhnno() {
		return phnno;
	}

	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}


	}
	


