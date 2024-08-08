package assignment;

import java.util.ArrayList;

/*• Write a Java program to reverse elements in an array list. 
*/
public class program_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("blueberry");
		list.add("almond");
		System.out.println("orignal list " +list);
		System.out.println("");
		System.out.println("reversed list " +list.reversed());
		
		
	}

}
