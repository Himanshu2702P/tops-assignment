package assignment;

import java.util.HashMap;

/*• Write a Java program to count the number of key-value (size) mappings in a map. 
*/
public class program_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String>map= new HashMap<>();
		map.put("apple", "red");
		map.put("banana", "yellow");
		map.put("grapes", "green");
		map.put("berry", "blue");
		
		System.out.println("hashmap :" + map);
		
		int size = map.size();
		
		System.out.println("hashmap " + size);
	}

}
