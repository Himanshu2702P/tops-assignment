package assignment;
/*W.A.J.P to check whether a given string ends with the 
 contents of another string."Java Exercises" ends 
 with "se"? False "Java Exercise" ends with "se"? True */
public class program_15 {

	public static void main(String[] args) {
		String str1 = "Java Exercises";
		String suffix1 ="se";
		String str2 = "Java Exercise";
		String suffix2 ="se";

		
		Boolean checking =str1.endsWith(suffix1);
		System.out.println("string1 ends with se : "+checking);
		
		
		Boolean checking2 =str2.endsWith(suffix2);
		System.out.println("string1 ends with se : "+checking2);
	}

}
