package com.jdc.dynamic;
/**
 * 
 * @author user
 *
 */

public interface Array<T> {
	
	// insert
	boolean insert(T data);
	
	// delete first element
	T deleteFirst();
	
	// delete last element
	T deleteLast();
	
	// delete at specific index
	T delete(int index);
	

}
