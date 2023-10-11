package com.jdc.mkt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;

@Entity
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private LocalDate dateOFBirth;
	private boolean active;
	@Embedded
	private Contact contact;
	private Gender gender;
//	@ElementCollection
//	private List<String> desc;
	
	public enum Gender{
		MALE,FEMALE
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, LocalDate dateOFBirth, boolean active, Contact contact, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.dateOFBirth = dateOFBirth;
		this.active = active;
		this.contact = contact;
		this.gender = gender;
		//this.desc = desc;
	}
	
	
	
	
	}

