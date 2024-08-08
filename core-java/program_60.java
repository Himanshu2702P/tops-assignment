
package assignment;

import java.util.HashMap;

/*Write a Java program to associate the specified value with the specified key in a
Hash Map*/
public class program_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String>map= new HashMap<>();
		map.put("apple", "red");
		map.put("banana", "yellow");
		map.put("Cherry", "Red");
        map.put("Date", "Brown");
        map.put("Elderberry", "Purple");
        
        System.out.println("orignal hashmap : " + map);
        
        String key ="papaya";
        String value="green";
        map.put(key, value);
        
        System.out.println("new hashmap"+map);
	}

}
