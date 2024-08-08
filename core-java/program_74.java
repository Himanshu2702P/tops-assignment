package assignment;

import java.util.Collection;
import java.util.HashMap;

/*Write a Java program to get a collection view of the values contained in this map.*/
public class program_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
        map.put("1", "Apple");
        map.put("2", "Banana");
        map.put("3", "Cherry");
        map.put("4", "Date");
        
        Collection<String> values = map.values();
        
        System.out.println("orignal map : " +map);
        
        System.out.println("collection of values : " +values);
	}

}
