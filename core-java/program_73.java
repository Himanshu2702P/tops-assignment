package assignment;

import java.util.HashSet;

/*Write a Java program to compare two sets and retain elements which are same on
both sets. */
public class program_73 {

	public static void main(String[] args) {
		
		HashSet<String>set1 = new HashSet<String>();
		set1.add("apple");
		set1.add("banana");
		set1.add("flexseed");
		set1.add("papaya");
		
		System.out.println("set 1 : " +set1);
		
		HashSet<String>set2 =  new HashSet<String>();
		set2.add("apple");
		set2.add("almond");
		set2.add("papaya");
		set2.add("orange");
		
		System.out.println("set 2 : " +set2);
		
		set1.retainAll(set2);
		
		System.out.println("Set after retaining common elements : " +set1);

	}

}
