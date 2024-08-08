package assignment;
/*W.A.J.P to check whether a given string starts with the 
contents of another string.Red is favorite color. 
Starts with Red? True Orange is also my favorite color. Starts
with Red? False*/
public class program_16 {

	public static void main(String[] args) {
		
		String str1 ="Red is favorite color ";
		String suffix1="Red";
		String str2 ="orange is favorite color ";
		String suffix2="Red";
		
		Boolean checking = str1.startsWith(suffix1);
		Boolean checking2 = str2.startsWith(suffix2);
		
		System.out.println("string1 start with Red :  "+checking);
		System.out.println("string2 start with Red :  "+checking2);

	}

}
