package assignment;

import java.util.ArrayList;
import java.util.Scanner;
/*• Write a Java program to search an element in an array list. 
*/
public class program_53 {

	public static void main(String[] args) {
		
		

		ArrayList<String>arrayList = new ArrayList<>();
			arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        arrayList.add("Date");
	        
	        System.out.println("arraylist " +arrayList);
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter element to search : ");
	        String element=sc.nextLine();
	        
	        if (arrayList.contains(element)) {
					System.out.println("element"+element+ " found in index " + arrayList.indexOf(element));
	        		
			} else {
	            System.out.println("Element '" + element + "' not found in the ArrayList.");

			}
	       sc.close(); 
	        
	}

}
