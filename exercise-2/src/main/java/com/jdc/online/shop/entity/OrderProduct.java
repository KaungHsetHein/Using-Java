package com.jdc.online.shop.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "orderproduct_tbl")
public class OrderProduct implements Serializable{

   
    private static final long serialVersionUID = 1L;
	public OrderProduct() {
    }

   
	@EmbeddedId
    private OrderProductPK id;
	@ManyToOne
	private Order order;
	@OneToOne
	private Product product;
    private int quantity;
    private int unitPrice;
	public OrderProduct(OrderProductPK id, Order order, Product product, int quantity, int unitPrice) {
		super();
		this.id = id;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

    
}