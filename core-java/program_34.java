package assignment;
/*• W.A.J. P to demonstrate try catch block*/
public class program_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            int numerator = 10;
	            int denominator = 0;
	            int result = numerator / denominator; // ArithmeticException
	            
	         System.out.println("Result: " + result);
	         
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	}

}
