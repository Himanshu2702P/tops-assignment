package assignment;
/*Create a class to print an integer and a character with two methods having
 the same name but different sequence of the integer and the character 
 parameters. Forexample, if the parameters of the first method are of the 
 form (int n, char c), then that of the second method will 
 be of the form (char c, int n). */
public class program_19 {
	
	public void first(int n, char c) {
		System.out.println("integer : "+ n + "  char  :" + c);
	}
	
	public void first(char c, int n) {
		System.out.println("char : "+c+ " integer  :"+n);
	}
	
	public static void main(String[] args) {
		
		
		program_19 printer = new program_19();
		
		printer.first(10,'h');
		printer.first('j', 27);

	}

}
