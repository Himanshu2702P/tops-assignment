package assignment;
import java.util.Scanner;
/*W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.*/
public class program_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 	Scanner sc = new Scanner(System.in);
				System.out.println("Enter your age here ");
				int age =sc.nextInt();
			if(age<=18) {
					throw new ArithmeticException("age is below 18");
				}
			else {
				System.out.println("you can vote ");
			}
				
			
		} catch (ArithmeticException e) {

		}
		
	}
	
	
}
