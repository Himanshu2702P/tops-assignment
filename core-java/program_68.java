package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*• Write a Java program to convert a hash set to a List/Array List. 
*/
public class program_68 {

	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Date");
	        set.add("Elderberry");

	        System.out.println("Original HashSet: " + set);
	        
	        List <String> list = new ArrayList<>(set);
	        
	        System.out.println("Arraylist : " +list);
	}

}
