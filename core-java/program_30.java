package assignment;
import java.util.Scanner;
/*Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 
	1*2*3*(n-1)*n.
 E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0 
*/


public class program_30 {

   
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial of negative numbers is undefined.");
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

      
        long fact = factorial(number);

      
        if (fact != -1) {
            System.out.println("Factorial of " + number + " is: " + fact);
        }

        scanner.close();
    }
}
