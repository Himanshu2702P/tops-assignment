package assignment;

/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code} 
*/
public class program_37 {

	public static void main(String[] args) {
		
		try {
			try {
				int a[] = new int[5];// arithmatic
				a[5] = 30 / 0;


			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
		}
		
			
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");

		}

	}

}
