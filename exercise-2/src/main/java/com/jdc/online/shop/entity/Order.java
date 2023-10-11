package com.jdc.online.shop.entity;

import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Enumerated;
import static javax.persistence.EnumType.STRING;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Getter
@Setter
@Table(name = "Order_tbl")
public class Order implements Serializable{


    private static final long serialVersionUID = 1L;

	public Order() {
    }


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   @ManyToOne
    
	private Customer customer;

   @OneToMany
    private List<OrderProduct> products;

    
	private LocalDateTime issueAt;

   
    @Enumerated(STRING)
	private Status status;

    @ManyToOne
    @JoinColumn(name = "deliveryAddress_id", referencedColumnName = "id")
	private Address deliveryAddress;

    private int deliveryFees;

    public enum Status {
        Ordered,
        Delivered,
        Finished,
        Cancel
    }

	public Order(long id, Customer customer, List<OrderProduct> products, LocalDateTime issueAt, Status status,
			Address deliveryAddress, int deliveryFees) {
		super();
		this.id = id;
		this.customer = customer;
		this.products = products;
		this.issueAt = issueAt;
		this.status = status;
		this.deliveryAddress = deliveryAddress;
		this.deliveryFees = deliveryFees;
	}
    
    

}