package assignment;

import java.util.ArrayList;

/*Write a Java program to insert an element into the array list at the first position*/
public class program_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>aL2= new ArrayList<>();
		aL2.add("apple");
		aL2.add("Strawberry");
		aL2.add("grape");
		aL2.add("pineapple");
		
		System.out.println("orignal list "+aL2);
		
		aL2.add(0, "blueberry");
		
		System.out.println("new list " +aL2);
	}

}
