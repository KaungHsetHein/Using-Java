package com.jdc.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamApp {

	public static void main(String[] args) {
		
		
	//writeFile(new Person("Thidar","Female",20));
		readFile();
		

	}
	
	static void readFile() {
		
		try (var in = new ObjectInputStream(new FileInputStream("persn.ser"))){
			
			var obj = (Person) in.readObject();
			
			String format = """
					Name:%s
					Gender:%s
					Age:%s
					""".formatted(obj.getName(),obj.getGender(),obj.getAge());
			
			System.out.println(format);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	static void writeFile(Person p) {
		
try(var out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
			
			out.writeObject(p);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
