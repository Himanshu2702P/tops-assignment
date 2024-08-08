package assignment;

import java.util.HashSet;

import java.util.Iterator;

/*• Write a Java program to iterate through all elements in a hash list. 
*/
public class program_59 {

	public static void main(String[] args) {
		
		HashSet<String>set= new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("berry");
		set.add("almond");
		
		
		System.out.println("iterating using itertor : " );
		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("");
		System.out.println("using for eachloop");
		for(String element : set) {
			System.out.println(element);
		}
	}

}
