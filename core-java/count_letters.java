package assignment;

import java.util.Scanner;

public class count_letters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter here for count letter : ");
		String input = sc.next();
		
		int lettercount=0;
		int numberscount=0;
		int spacescount=0;
		int otherCount=0;
		
		 for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
	            if (Character.isLetter(ch)) {
	                lettercount++;
	            } else if (Character.isDigit(ch)) {
	                numberscount++;
	            } else if (Character.isSpaceChar(ch)) {
	                spacescount++;
	            } else {
	                otherCount++;
	            }
	        }
		 System.out.println("Input string: " + input);
	        System.out.println("Letter count: " + lettercount);
	        System.out.println("Number count: " +numberscount );
	        System.out.println("Space count: " + spacescount);
	        System.out.println("Other character count: " + otherCount);
	        
	        sc.close();
	}

}
