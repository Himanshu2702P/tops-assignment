package assignment;
/*• Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. */
class rectangle{
	int  length;
	int  breadth;
	
	rectangle(int length,int breadth) {
		this.length =length;
		this.breadth =breadth;
	}
	
	public void area() {
		int a1=length*breadth;
		System.out.println("area  = "+a1);
	}
	public void perimeter() {
		int p1 = 2*(length+breadth);
		System.out.println("perimeter = " +p1);
	}
	
}
class square extends rectangle{

	public square(int length) {
		super(length,length);
		// TODO Auto-generated constructor stub
	}
	
}
public class program_23 {

	public static void main(String[] args) {
		rectangle r = new rectangle(20, 50);
		System.out.println("rectangle");
		r.area();
		r.perimeter();
		
		System.out.println();
		square s = new square(20);
		System.out.println("square");
		s.area();
		s.perimeter();
	}

}
