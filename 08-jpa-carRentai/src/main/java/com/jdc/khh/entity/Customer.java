package com.jdc.khh.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.jdc.khh.entity.Account.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
//@DiscriminatorValue(value = "Customer")
public class Customer extends Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String passport;
	private boolean isLocal;
	public Customer() {
		super();
		setRole(Role.CUSTOMER);
	}
	public Customer(String name, Address address, Gender gender, Contact contact) {
		super(name, address, gender, contact);
		// TODO Auto-generated constructor stub
		setRole(Role.CUSTOMER);
	}
	
	

}
