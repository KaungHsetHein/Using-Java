package com.jdc.online.shop.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Getter
@Setter
@Table(name = "address_tbl")
public class Address implements Serializable{
	
	
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @ManyToOne
	private Customer customer;
    private String building;
    private String street;
    private String townships;
    
    public Address() {
    }

	public Address(int id, Customer customer, String building, String street, String townships) {
		super();
		this.id = id;
		this.customer = customer;
		this.building = building;
		this.street = street;
		this.townships = townships;
	}

    
	
    
    

}