package assignment;

import java.util.ArrayList;

/* Write a Java program to remove the third element from an array list. 
*/
public class program_52 {

	public static void main(String[] args) {
		

		ArrayList<String>arrayList = new ArrayList<>();
			arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        arrayList.add("Date");
	      
	        
	        System.out.println(arrayList);
	              
	        if (arrayList.size()>=3) {
					arrayList.remove(3);
			} else {
				System.out.println("The list does not have at least three elements.");
			}
	        
	        System.out.println("ArrayList after removing the third element: " + arrayList);
	      
	}

}
