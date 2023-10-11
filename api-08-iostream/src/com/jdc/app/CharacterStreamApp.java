package com.jdc.app;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamApp {

	public static void main(String[] args) {
		
		try(var in = new FileReader("data.txt");
				var out = new FileWriter("out.txt")){
			
			int data;
			while(-1 != (data = in.read()))
				out.write(data);
			
			System.out.println("Program complete");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
