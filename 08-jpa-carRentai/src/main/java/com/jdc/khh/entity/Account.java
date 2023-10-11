package com.jdc.khh.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Inheritance;
import static javax.persistence.InheritanceType.JOINED;
import static javax.persistence.InheritanceType.TABLE_PER_CLASS;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.EnumType.STRING;

//@MappedSuperclass
@Entity
@Getter
@Setter
//@Inheritance(strategy = JOINED)
//@DiscriminatorValue(value = "Account")
@DiscriminatorColumn(name = "acc_type")
public  abstract class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	private Address address;
	@Enumerated(STRING)
	private Gender gender;
	@Embedded
	private Contact contact;
	
	@Enumerated(STRING)
	private Role role;
	
	
	
	public Account(String name, Address address, Gender gender, Contact contact) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.contact = contact;
		
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}



	public enum Role{
		ADMIN,DRIVER,CUSTOMER
	}
	
	
	
	public enum Gender{
		MALE,FEMALE
	}
}
