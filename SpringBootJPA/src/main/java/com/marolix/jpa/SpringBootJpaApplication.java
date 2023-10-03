package com.marolix.jpa;

import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jakarta.persistence.Table;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext con=	SpringApplication.run(SpringBootJpaApplication.class, args);

	 Entity e= new Entity(1, "babu","9898981233");
	Service s= con.getBean(Service.class);
	
	//System.out.println(s.insertEntity(e));
	//System.out.println(s.readEntity(e));
    //System.out.println(s.updateRecord("suresh",1));
   //s.deleteRecord(22);
//	System.out.println(s.readAllEntities());
	
	TreeSet<Integer> ts= new TreeSet<Integer>();
	ts.add(1);
	ts.add(2);
	ts.add(3);
	ts.add(4);
	System.out.println(s.readAll(ts));
	
//	s.deleteAll();

	}

}
