package com.jdc.box_unbox;

public class BoxUnBoxApp {
   @SuppressWarnings({"unused","removal"})
	public static void main(String[] args) {
		
		Byte wrapperByte = new Byte((byte)0);//autobox
		byte priByte =0;//unbox
		Short wrapperShort =new Short("0");
		short priShort = 0;
		Integer wrapperInt = new Integer("0");
		int priInt = 20;
		
		Long wrapperLong = new Long("0");
		long priLong = 0;
		//wrapper = primitive; error
		
		
		wrapperInt  = Integer.valueOf(priInt);
		priInt = wrapperInt.intValue();

	}

}
