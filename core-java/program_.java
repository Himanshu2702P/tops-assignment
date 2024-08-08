package assignment;
/*Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type.*/
public class program_ {
	
	public void  printn(int number) {
		System.out.println("integer"+number);
	}
	
	public void  printn(double number) {
		System.out.println("double"+number);
	}
	
	public void  printn(char charcter) {
		System.out.println("char"+charcter);
	}
	public void  printn(String text) {
		System.out.println("String"+text);
	}
	
	
	public static void main(String[] args) {
		
		program_ printer = new program_();
		
		printer.printn( 1);
		printer.printn( 011.1);
		printer.printn('h');
		printer.printn(" : java");
		

	}


}