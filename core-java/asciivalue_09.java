package assignment;
import java.util.Scanner;
public class asciivalue_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	 	System.out.println("enter character to check ascii number : ");
		
		char ch = sc.next().charAt(0);
		
		int ascii = ch;
		
		System.out.println("ascii value of "+ch+" is " +ascii);
		
		sc.close();
	}

}
