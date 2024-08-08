package assignment;

import java.util.ArrayList;

/*Write a Java program to replace the second element of an Array List with the
specified element. */
public class program_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list = new ArrayList<String>();
		list.add("almond");
		list.add("berry");
		list.add("apple");
		list.add("banana");
		
		
		System.out.println("first Arraylist " + list);
		
		String element = "blueberry";
		
		list.set(2, element);
		
		System.out.println("new list "+list);
		
	}

}
