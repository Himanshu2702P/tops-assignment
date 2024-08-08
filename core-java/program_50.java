package assignment;
import java.util.Scanner;
import java.util.ArrayList;

/*Write a Java program to retrieve an element (at a specified index) from a given array
list*/
public class program_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>arrayList = new ArrayList<>();
			arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        arrayList.add("Date");
	        
	        System.out.println(arrayList);
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the index of the element to retrieve: ");
	        int index = sc.nextInt();
	        
	        try {
				String element=arrayList.get(index);
				System.out.println("element of index "+ index +":"+ element);
	        	
			} catch (IndexOutOfBoundsException e) {
	            System.out.println("Error: Index out of bounds. Please enter a valid index.");

			}
	        sc.close();
	}

}
