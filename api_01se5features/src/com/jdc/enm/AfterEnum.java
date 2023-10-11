package com.jdc.enm;

public class AfterEnum {

	public static void main(String[] args) {
		
		
		checkDay(null);
		
		Day[] days = Day.values();
		
		for(Day d:days) 
			System.out.println("%S:%d".formatted(d.name(),d.ordinal()));
		
		
		Day wednesday = Day.valueOf(Day.class, "TUE");
		System.out.println(wednesday.getTitle());



	}
	public static void checkDay(Day day) {
		
		//Course c = day;
		
	 Day sunday  = Day.SUN;
	 
	 String otherday = sunday.toString();
	 
	 //System.out.println(sunday.toString());
	 System.out.println(otherday);
	 System.out.println(sunday.ordinal());

}

}