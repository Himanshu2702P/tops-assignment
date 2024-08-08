package assignment;
import java.util.Scanner;

/*Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user. */


class Complex {
	
	double real;
 double imaginary;

 public Complex(double real, double imaginary) {
     this.real = real;
     this.imaginary = imaginary;
 }

 public Complex add(Complex other) {
     double realPart = this.real + other.real;
     double imaginaryPart = this.imaginary + other.imaginary;
     return new Complex(realPart, imaginaryPart);
 }

 public Complex subtract(Complex other) {
     double realPart = this.real - other.real;
     double imaginaryPart = this.imaginary - other.imaginary;
     return new Complex(realPart, imaginaryPart);
 }

 public Complex multiply(Complex other) {
     double realPart = this.real * other.real - this.imaginary * other.imaginary;
     double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
     return new Complex(realPart, imaginaryPart);
 }

 public void print() {
     if (imaginary >= 0) {
         System.out.println(real + " + " + imaginary + "i");
     } else {
         System.out.println(real + " - " + (-imaginary) + "i");
     }
 }
}

public class program_25 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the real part of the first complex number: ");
     double real1 = scanner.nextDouble();
     System.out.print("Enter the imaginary part of the first complex number: ");
     double imaginary1 = scanner.nextDouble();

     System.out.print("Enter the real part of the second complex number: ");
     double real2 = scanner.nextDouble();
     System.out.print("Enter the imaginary part of the second complex number: ");
     double imaginary2 = scanner.nextDouble();

     Complex complex1 = new Complex(real1, imaginary1);
     Complex complex2 = new Complex(real2, imaginary2);

     Complex sum = complex1.add(complex2);
     Complex difference = complex1.subtract(complex2);
     Complex product = complex1.multiply(complex2);

     System.out.print("Sum: ");
     sum.print(); 

     System.out.print("Difference: ");
     difference.print(); 
     
     System.out.print("Product: ");
     product.print(); 
     
     scanner.close();
 }
}
