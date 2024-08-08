package assignment;

import java.util.ArrayList;
import java.util.Scanner;

/*• Write a Java program to update specific array element by given element. 
*/
public class program_51 {

	public static void main(String[] args) {


		ArrayList<String>arrayList = new ArrayList<>();
			arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        arrayList.add("Date");
	        
	        System.out.println(arrayList);
	        
	        Scanner sc = new Scanner(System.in);
	      
	        
	        System.out.print("Enter the index of the element to update : ");
	        int index = sc.nextInt();
	        			sc.nextLine();
	        			
	        //for new element
	        			System.out.print("Enter the new element: ");
	        	        String element = sc.nextLine();
	        try {
					arrayList.set(index, element);
				System.out.println("updated list "+arrayList);
	        	
			} catch (IndexOutOfBoundsException e) {
	            System.out.println("Error: Index out of bounds. Please enter a valid index.");

			}
	        sc.close();

	}

}
