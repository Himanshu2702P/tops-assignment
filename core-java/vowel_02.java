package assignment;
import java.util.Scanner;

public class vowel_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter single character : ");
		String input = sc.nextLine();
		
		if(input.length() != 1 || !Character.isLetter(input.charAt(0)))
		{
			System.out.println("Error: Please enter a single character or alphabet");
		}
		else {
			char ch = Character.toLowerCase(input.charAt(0));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            	}
			else {
				System.out.println("Consonant");
			}
	}
	 sc.close();
  }
}
