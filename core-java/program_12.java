package assignment;
/*Write a Java program to print numbers between 1 to 100 which
 are divisible by 3, 5
and by both*/
import java.util.Scanner;
public class program_12 {

	public static void main(String[] args) {
		
		System.out.println(" choose numbers between 1 to 100");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		if(num%3==0 && num%5==0) {
			System.out.println("number is divisible by 3 & 5");
		}
		
		else if(num%3==0) {
			System.out.println("number is divisible by 3");
		}
		else if(num%5==0) {
			System.out.println("number is divisible by 5");

		}
		
		sc.close();
	}

}
