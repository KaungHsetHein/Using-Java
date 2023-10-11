package com.jdc.varargs;
import static java.lang.System.out;

public class VarargsApp {

	public static void main(String... args) {
		// ... 0  or more 
		
		Data data = new Data();
		out.println(data.getClass().getSuperclass());
		
		Data[] datas = new Data[0];
		out.println(datas.getClass().getSimpleName());
		printVarargs(2);

	}
	
	public static void printVarargs(int i,String... data) {
		System.out.println(data);
	}
	
	public static void printAray(String[] args) {
		
	}

}
