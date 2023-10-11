package com.jdc.mkt.test;

import java.time.LocalDate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Contact;
import com.jdc.mkt.entity.Person;
import com.jdc.mkt.entity.Person.Gender;

public class PersonTest {
	
	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("jpaTest");
	}
	
	@AfterAll
	static void close() {
		if(null != emf && emf.isOpen()) {
			emf.close();
		}
	}
	@Test
	void test() {
		var em = emf.createEntityManager();
//		Contact c = new Contact("72st_natpyi_","willian@gmail.com","09-94949");
//		Person st = new Person(1,"Willian",LocalDate.now(),true,c,Gender.MALE);
		em.getTransaction().begin();
		//em.persist(st);
		em.getTransaction().commit();
	}

}
