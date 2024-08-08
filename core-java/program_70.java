package assignment;

import java.util.ArrayList;

/*Write a Java program to increase the size of an array list. */
public class program_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        
	        System.out.println("Original ArrayList: " + list);

	        list.add("Date");
	        list.add("Elderberry");
	        list.add("Fig");
	        list.add("Grape");
	        
	        System.out.println("ArrayList after adding more elements: " + list);
	        
	        int capacity = 20;
	        list.ensureCapacity(capacity);
	        
	        System.out.println("ArrayList after ensuring capacity: " + list);
	}

}
