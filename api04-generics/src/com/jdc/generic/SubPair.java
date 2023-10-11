package com.jdc.generic;

public class SubPair<K,V> implements Pair<K,V>{
	
	private K key;
	private V value;
	

	public SubPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	

	public void setKey(K key) {
		this.key = key;
	}


	public void setValue(V value) {
		this.value = value;
	}


	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
