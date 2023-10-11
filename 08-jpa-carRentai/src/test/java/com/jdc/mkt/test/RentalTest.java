package com.jdc.mkt.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.khh.entity.Account.Gender;
import com.jdc.khh.entity.Address;
import com.jdc.khh.entity.Admin;
import com.jdc.khh.entity.Contact;
import com.jdc.khh.entity.Driver;

public class RentalTest {

	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("carRentai");
	}
	
	@AfterAll
	static void close() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	
	@ParameterizedTest
	@CsvSource(value ="Andrew:22st:Aung Myay Tharxsn:mdy:MALE:andrew@gmail.com:093838",delimiter = ':')
	void test(String name, String street,String twonship,String city,Gender gender,String email,String contact) {
		
		Address ad = new Address(street,twonship,city);
		Contact c =new Contact(email,contact);
		
		var driver = new Driver(name,ad,gender,c);
		var admin = new Admin(name,ad,gender,c);
		
		var em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(ad);
		em.persist(driver);
		em.persist(admin);
		em.getTransaction().commit();
	}
}
