package com.jdc.khh.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "Admin")

public class Admin extends Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
		setRole(Role.ADMIN);
	}

	public Admin(String name, Address address, Gender gender, Contact contact) {
		super(name, address, gender, contact);
		// TODO Auto-generated constructor stub
		setRole(Role.ADMIN);
	}
	
	

}
