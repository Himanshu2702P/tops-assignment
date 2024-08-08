package assignment;

import java.util.ArrayList;
import java.util.Collections;

/*• Write a Java program to shuffle elements in an array list. 
*/
public class program_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list= new ArrayList<>();
		list.add("date");
		list.add("almond");
		list.add("berry");
		list.add("blueberry");	
	
		System.out.println("arraylist : " +list);
		
		Collections.shuffle(list);
		
		System.out.println("suffle list : " +list);
	}

}
