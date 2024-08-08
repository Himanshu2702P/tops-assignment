package assignment;

import java.util.ArrayList;

/*• Write a Java program to compare two array lists. 
*/
public class program_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list = new ArrayList<String>();
		list.add("almond");
		list.add("bherry");
		list.add("apple");
		
		
		System.out.println("first Arraylist " + list);
		
		ArrayList<String>list1 = new ArrayList<String>();
		list1.add("banana");
		list1.add("wheat");
		list1.add("cherry");
		
		System.out.println("second arraylist " +list1);
		
		if (list1.equals(list)) {
				System.out.println("both arraylist are similar");
			
		} else {
				System.out.println("diffent arraylist");
		}
	}

}
