package assignment;

import java.util.HashSet;

/*• Write a Java program to convert a hash set to an array. 
*/
public class program_67 {

	public static void main(String[] args) {
		
		HashSet<String>set= new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("papaya");
		set.add("orange");
		
		System.out.println("Hashset : " +set);
		
		String[] array = set.toArray(new String[0]);
		
		System.out.println("");
		System.out.println(" Array  ");
		for(String element : array) {
			System.out.println(element + " ");
		}
	}

}
