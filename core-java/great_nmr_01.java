package assignment;
import java.util.Scanner;
public class great_nmr_01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	

	System.out.println("Enetr your First numbers");
	int a = sc.nextInt() ;
	
	System.out.println("Enetr your Second numbers");
	int b = sc.nextInt() ;
	
	System.out.println("Enetr your Third numbers");
	int c = sc.nextInt() ;
	
	if(a>b)
		if(a>c){
		System.out.println("The Greatest :"+a);
		}
	if(b>a)
		if(b>c){
		System.out.println("The Greatest :"+b);
		}
	
	if(c>a)
		if(c>b){
		System.out.println("The Greatest :"+c);
		
		sc.close();
		}
	}

}
