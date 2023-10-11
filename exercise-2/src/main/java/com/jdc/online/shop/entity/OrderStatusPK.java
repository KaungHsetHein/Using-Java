package com.jdc.online.shop.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class OrderStatusPK implements Serializable{

    private static final long serialVersionUID = 1L;
	public OrderStatusPK() {
    }

    private int orderId;
    private LocalDateTime updateAt;
	public OrderStatusPK(int orderId, LocalDateTime updateAt) {
		super();
		this.orderId = orderId;
		this.updateAt = updateAt;
	}
    
    

}