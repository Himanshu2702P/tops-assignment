package assignment;

import java.util.ArrayList;

/*• Write a Java program to join two array lists. 
*/
public class program_66 {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("almond");
		list.add("berry");
		list.add("apple");
		
		
		System.out.println("first Arraylist " + list);
		
		ArrayList<String>list1 = new ArrayList<String>();
		list1.add("banana");
		list1.add("wheat");
		list1.add("cherry");
		
		System.out.println("second arraylist " +list1);
		System.out.println("");
		list.addAll(list1);
		System.out.println(list);
	}

}
