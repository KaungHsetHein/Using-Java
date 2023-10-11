package com.jdc.online.shop.entity;

import java.util.*;

/**
 * 
 */
public class Order {

    /**
     * Default constructor
     */
    public Order() {
    }

    /**
     * 
     */
    private Customer customer;

    /**
     * 
     */
    private List<OrderProduct> products;

    /**
     * 
     */
    private LocalDateTime issueAt;

    /**
     * 
     */
    private Status status;

    /**
     * 
     */
    private Address delivery;

    /**
     * 
     */
    public int deliveryFees;

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    public enum Status {
        Ordered,
        Delivered,
        Finished,
        Cancel
    }

}