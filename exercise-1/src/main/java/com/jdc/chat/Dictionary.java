package com.jdc.chat;

import java.util.*;

/**
 * 
 */
public class Dictionary {
	
	private Map<String,String> words;

    /**
     * Default constructor
     */
    public Dictionary() {
    	words = new HashMap<>();
    	
    }

    /**
     * 
     */
   

    /**
     * @param keyword 
     * @return
     */
    public String get(String keyword) {
        // TODO implement here
        return words.get(keyword);
    }

    /**
     * @param keyword 
     * @param definition
     */
    public void put(String keyword, String definition) {
        // TODO implement here
    	words.put(keyword, definition);
    	
    	
    }

}