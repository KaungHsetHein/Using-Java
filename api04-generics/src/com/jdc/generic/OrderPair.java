package com.jdc.generic;

public class OrderPair<K> implements Pair<K, Integer> {
	
	private K key;
	private Integer value;
	
	
	public OrderPair(K key, Integer value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return null;
	}
	
	@Override
	public Integer getValue() {
		return null;
	}

}
