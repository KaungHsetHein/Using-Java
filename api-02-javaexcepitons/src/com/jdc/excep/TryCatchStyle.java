package com.jdc.excep;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchStyle {

	public static void main(String[] args) {
		
		checkNumber(5);
		
	}

	static void checkNumber(int number) {
		//try with resource 
		//try with finally
		// try with catch
		//try with catch finally
		// single catch(only catch block and only one exception type in cath
		//multi cath (multiple exception type in single catch block)
		//multi handler (multiple catch block)
		
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Start try");
			
			File file = new File("");
			file.createNewFile();
		     scan.close();
			
			//Thread.sleep(1000);
			for (int i= 0;i<10;i++) {
				if(i== number) {
					System.out.println(i/0);
				}else {
					
					System.out.println(new int[]{1,1,1}[5]);
				}
				//return;
			}
				System.out.println("End try");
		}catch(ArrayIndexOutOfBoundsException|IOException e) {
		System.err.println("Error occured");
	}
	}
}

			
//		} catch(ArrayIndexOutOfBoundsException) {
//			System.out.println("Arrayout exception occured");
//		catch(RuntimeException e) {
//			System.out.println("Runtime Exceptioion Occured");
//		}
//		catch(InterruptedException e) {
//			e.printStackTrace();
//		} catch(Exception e) {
//			System.err.println(e.getMessage());
//		}
	
//		finally {
//			int result = 0;
//			
//			for(int i = 0;i<= number;i++)
//				result += number;
//			System.out.println("BlahBlah"+result);
//		}
//	System.out.println("Program terminated..");
//	}
	

