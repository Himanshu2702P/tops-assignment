package assignment;
import java.util.ArrayList;
/*Write a Java program to create a new array list, add some colors (string) and print out
the collection*/
public class program_47 {

	public static void main(String[] args) {
		ArrayList<String>colour = new ArrayList<>();
		
		colour.add("Red");
		colour.add("yellow");
		colour.add("violet");
		colour.add("white");
		
		System.out.println("colours in arraylist " +colour);
		
		System.out.println("colour individually : ");
		for(String color: colour) {
			System.out.println(color);
		}

	}

}
