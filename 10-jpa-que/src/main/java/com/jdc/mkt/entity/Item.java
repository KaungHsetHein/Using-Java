package com.jdc.mkt.entity;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "item")
//@NamedQuery(name = "Item.selectByCategoryName",query = "select i from Item i where i.category.name = :cat")
//@NamedQuery(name = "Item.updateById",query = "update Item i set i.price = :price where i.id = :id")
//@NamedQuery(name = "Item.deleteById",query = "delete from Item i where i.id = :id")
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	private int price;
	@ManyToOne(cascade = PERSIST, fetch = LAZY)
	private Category category;
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "cus_id", referencedColumnName = "id"))
	private List<Customer> customers;
	public Item(String name, int price, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
}
