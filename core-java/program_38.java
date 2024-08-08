package assignment;
import java.util.Scanner;
/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic */
public class program_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		try {	
			System.out.println("Enter number A ");
			double a = sc.nextDouble();
			System.out.println("Enter number B ");
			double b = sc.nextDouble();
			
			double result = a/b;
			System.out.println("Result "+ result);
			
		} catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

			// TODO: handle exception
		}
		sc.close();
		

	}

}

