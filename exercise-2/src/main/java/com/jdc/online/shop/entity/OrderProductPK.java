package com.jdc.online.shop.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class OrderProductPK implements Serializable{

    private static final long serialVersionUID = 1L;
	public OrderProductPK() {
    }
    private int orderId;
    private int productId;
	public OrderProductPK(int orderId, int productId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
	}

    
}