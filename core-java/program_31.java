package assignment;
/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods.
*/

abstract class shape{
	abstract void regtangleArea(int a,int b);
	abstract void squareArea(int a);
	abstract void circleArea(int a);
}

class area extends shape{
	@Override
	void regtangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		
		System.out.println("Area of regtangle "+length*breadth);
		
	}
	@Override
	void squareArea(int side) {
		
		System.out.println("Area of regtangle "+side*side);
		
	}
	@Override
	void circleArea(int radius) {
		// TODO Auto-generated method stub
		System.out.println("Area of circle"+3.14*radius*radius);
	}
}
public class program_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			area a =new area();
			a.regtangleArea(20,30);
			a.squareArea(12);
			a.circleArea(10);
	}

}
