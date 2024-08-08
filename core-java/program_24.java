package assignment;
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/

class triangle{
	int side1 ;
	int side2 ;
	int side3 ;
	
	public  triangle() {
		 side1 = 3;
		 side2 = 4;
		 side3 = 5;
	}
	 public void area() {
		 //for semi perimeter
		 int s =(side1+side2+side3)/2;
		 //for area
		 int a1=(s * (s - side1) * (s - side2) * (s - side3));
		 System.out.println("area of triangle   "+a1);
	 }
	 public void perimeter() {
		 int p1=(side1+side2+side3);
		 System.out.println("perimeter of triangle   "+p1);
	 }
}
public class program_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t = new triangle();
		t.area();
		t.perimeter();
	}

}
