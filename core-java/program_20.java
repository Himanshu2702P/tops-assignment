package assignment;
/*Create a class to print the area of a square and a rectangle. The class has 
 two methods with the same name but different number of parameters. The method 
 for printing area of a rectangle has two parameters which are length and 
 breadth respectively while the other method for printing area of square 
 has one parameter which is side of square*/
public class program_20 {
	
	public void area(int a){
		System.out.println("area of square : "+a*a);
	}
	
	public void area(int a,int b){
		System.out.println("area of square : "+a*b);

	}
	public static void main(String[] args) {
		
		program_20 obj = new program_20();
		obj.area(4);
		obj.area(5, 7);
	}

}
