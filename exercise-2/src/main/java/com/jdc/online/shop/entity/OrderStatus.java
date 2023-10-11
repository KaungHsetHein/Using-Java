package com.jdc.online.shop.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import com.jdc.online.shop.entity.Order.Status;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.Enumerated;
import static javax.persistence.EnumType.STRING;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "orderstatus_tbl")
public class OrderStatus implements Serializable{

    private static final long serialVersionUID = 1L;
	public OrderStatus() {
    }

	@EmbeddedId
    private OrderStatusPK id;
	@OneToOne
	private Order order;
    @Enumerated(STRING)
	private Status status;
    private LocalDateTime updateAt;
	public OrderStatus(OrderStatusPK id, Order order, Status status, LocalDateTime updateAt) {
		super();
		this.id = id;
		this.order = order;
		this.status = status;
		this.updateAt = updateAt;
	}
    
    

}