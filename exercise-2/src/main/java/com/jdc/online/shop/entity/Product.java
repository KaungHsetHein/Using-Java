package com.jdc.online.shop.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.CollectionTable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "product_tbl")
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;
	public Product() {
    }

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String brand;

    private int price;
    @ElementCollection
	private List<Photo> photos;

    
    @ElementCollection
	private Map<String, String> features;
    @OneToOne
	private Category category;
	public Product(int id, String name, String brand, int price, List<Photo> photos, Map<String, String> features,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.photos = photos;
		this.features = features;
		this.category = category;
	}
    
    

}