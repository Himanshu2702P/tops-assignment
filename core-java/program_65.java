package assignment;

import java.util.ArrayList;

/**/
public class program_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list = new ArrayList<String>();
		list.add("almond");
		list.add("berry");
		list.add("apple");
		list.add("banana");
		list.add("wheat");
		
		System.out.println("first Arraylist " + list);
		
		int index1 = 1;
		int index2 = 3;
		
		   swapElements(list, index1, index2);
		
	  System.out.println("ArrayList after swapping elements at indices " + index1 + " and " + index2 + ": " + list);

	}

	public static void swapElements(ArrayList<String> list, int index1, int index2) {
		// TODO Auto-generated method stub
		 if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
	            throw new IndexOutOfBoundsException("Invalid index.");
	        }
		 String temp = list.get(index1);
		 list.set(index1,list.get(index2));
		 list.set(index2, temp);
	}

}
