package assignment;
import java.util.Scanner;
public class sum_avg_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number=5;
		int sum =0;
		double avg;
		
		for(int i=1;i<=number;i++) {
			int inputs =sc.nextInt();
			sum+=inputs;
		}
		avg = sum/number;
		System.out.println("sum of numbers : "+sum );
		System.out.println("sum of numbers : "+avg );
		
		sc.close();
	}	
}
