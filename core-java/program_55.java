package assignment;

import java.util.ArrayList;
import java.util.Collections;

/*• Write a Java program to copy one array list into another. 
*/
public class program_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list= new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("berry");
		list.add("date");
		list.add("almond");
		
		System.out.println("orignal list " +list);
		
		ArrayList<String>list1= new ArrayList<>(list.size());
		for(int i = 0;i<list.size();i++) {
			list1.add(null);
		}
		
		
		Collections.copy(list1, list);
		
		System.out.println("copy list "+list1);
	}

}
