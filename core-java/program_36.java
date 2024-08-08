package assignment;


/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
exception and another one is to handle ArrayIndexOutOfBoundException) 
int a [] =new int [5]; a [5]=30/0; */
public class program_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {	int a [] =new int [5];//arithmatic 
					a [5]=30/0;
					
			
			
		} catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
			}
		
            
		try { 
				int[] b = new int[5];//out of bound
	            b[5] = 30;
				
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Array Index Out of Bounds Exception: " + e2.getMessage());

			}
		
	}

}
