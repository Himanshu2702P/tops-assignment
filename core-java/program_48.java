package assignment;

import java.util.ArrayList;
import java.util.Iterator;

/*• Write a Java program to iterate through all elements in an array list*/
public class program_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aL1=new ArrayList<>();
		aL1.add("apple");
		aL1.add("banana");
		aL1.add("kiwi");
		aL1.add("blueberry");
		
		//using loop
		for(int i = 0;i<aL1.size();i++) {
			System.out.println(aL1.get(i));
		}
		
		//using for each loop
		for(String fruit : aL1) {
			System.out.println(fruit);
		}
		
		//using itretor
		 System.out.println("\nUsing an Iterator:");
	        Iterator<String> iterator = aL1.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	}

}
