import java.util.Scanner;

public class NumberTowords {
	
	private static final String[] units = {
	        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	    };

	    private static final String[] tens = {
	        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };

	    public static String numberToWords(int num) {
	        if (num == 0) {
	            return "Zero";
	        }
	        return convertToWords(num);
	    }

	    private static String convertToWords(int num) {
	        String result = "";
	        if (num < 20) {
	            result = units[num];
	        } else if (num < 100) {
	            result = tens[num / 10] + " " + convertToWords(num % 10);
	        } else if (num < 1000) {
	            result = units[num / 100] + " Hundred " + convertToWords(num % 100);
	        } else if (num < 1000000) {
	            result = convertToWords(num / 1000) + " Thousand " + convertToWords(num % 1000);
	        }
	        return result.trim();
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	      int number = scan.nextInt();
	        String words = (String) numberToWords(number);
	        System.out.println( words);
	        scan.close();
	    }


}
