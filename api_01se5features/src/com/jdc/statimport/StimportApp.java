package com.jdc.statimport;

import static com.jdc.statimport.other.GeneralImport.showStValue;
import static com.jdc.statimport.other.GeneralImport.stValue;
import static java.lang.System.out;

import com.jdc.statimport.other.GeneralImport;
public class StimportApp {

	public static void main(String[] args) {
//		Date d = new Date(10L);
//		java.sql.Date sqlDate = new java.sql.Date(1000L);
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		
		out.println(stValue);
		showStValue();
		
		GeneralImport imp = new GeneralImport();
		imp.showInstValue();

	}

}
