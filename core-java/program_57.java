package assignment;

import java.util.HashSet;

/*• Write a Java program to append the specified element to the end of a hash set. */
public class program_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("blueberry");
		
		System.out.println("orignal set : "+set);
		
		String newElement = "date";
		set.add(newElement);
		
		System.out.println("hashset after adding " + newElement + " " + set );
	}

}
