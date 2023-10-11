package com.jdc.chat;

import java.util.*;

/**
 * 
 */
public class ChatBot {

	private Dictionary dictionary;

	private String lastQuestion;

	public ChatBot() {
		
		this.dictionary = new Dictionary();

	}

	public String talk(String message) {
		String result = null;

		if (null == lastQuestion) {

			result = dictionary.get(message);
			if (null == result) 
			lastQuestion = message;
				result = "teach me please";
				
			
			} else {
			dictionary.put(lastQuestion, message);
			lastQuestion = null;
			result = "Thank for teach me!";
			

		}

		return result;
	}

}