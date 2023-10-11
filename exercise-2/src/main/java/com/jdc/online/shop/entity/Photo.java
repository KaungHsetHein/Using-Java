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
public class Photo implements Serializable{

    private static final long serialVersionUID = 1L;

	public Photo() {
    }
    private String url;

    private boolean cover;

	public Photo(String url, boolean cover) {
		super();
		this.url = url;
		this.cover = cover;
	}
    
    

}