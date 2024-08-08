package assignment;

import java.util.LinkedHashSet;

/*• Write a Java program to append the specified element to the end of a hash set. */
public class program_58 {

	public static void main(String[] args) {
		
		LinkedHashSet<String>set = new LinkedHashSet<>();
		set.add("dates");
		set.add("almond");
		set.add("apple");
		set.add("blueberry");
		set.add("banana");
		
		System.out.println("orignal Linkhashset : " +set);
		
		String element = "red";
		set.add(element);
		
		System.out.println("Linkhashset : " + element + " "+set);
	}

}
