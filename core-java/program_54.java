package assignment;

import java.util.ArrayList;
import java.util.Collections;

/*• Write a Java program to sort a given array list. 
*/
public class program_54 {

	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("apple");
		list.add("berry");
		list.add("strawberry");
		
		System.out.println("orignal list : " +list);
		
		Collections.sort(list);
		
		System.out.println("sorted list : " +list);
	}

}
