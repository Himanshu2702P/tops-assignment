package assignment;
/*Write a Java program that accepts an integer (n) and computes the value of
n+nn+nnn. Input number: 5 */
import java.util.Scanner;
public class program_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int n =sc.nextInt();
		int sum = n+ (n+n)+ (n+n+n);
		System.out.println("your sum : "+sum);
		
		sc.close();
	}

}
