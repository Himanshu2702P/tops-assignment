package assignment;

import java.util.ArrayList;
import java.util.List;

/*• Write a Java program to extract a portion of an array list. 
*/
public class program_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list= new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("blueberry");
		list.add("almond");
        list.add("Grape");

		
		System.out.println("orignal list : "+list);
		
		int formindex = 3;
		int toindex = 4;
		
		List<String>sublist= list.subList(formindex, toindex);
		
		System.out.println("extracted list: " +sublist);
	}

}
