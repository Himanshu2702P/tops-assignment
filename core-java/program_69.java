package assignment;

import java.util.HashMap;

/*Write a Java program to check whether a map contains key-value mappings (empty)
or not*/
public class program_69 {

	public static void main(String[] args) {
		HashMap<String, String>  map = new HashMap<String, String>();
		map.put("apple", "red");
		if (map.isEmpty()) {
				System.out.println("map is empty");
		} else {
				System.out.println("map contain key and value");
		}

	}

}
