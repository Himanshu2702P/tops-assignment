package assignment;
import java.util.Scanner;
/*Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0 */
public class program_35 {

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
