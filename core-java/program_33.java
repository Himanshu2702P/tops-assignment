package assignment;
/*Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class. */
class shape1{
	void name(){
		System.out.println("this is shape ");
	}
}
class rectangle1 extends shape1{
	void name1() {
		System.out.println("this is rectangle shape ");
	}
}
class circle1 extends shape1{
	void name2() {
		System.out.println("this is circle shape ");
	}
}
class square1 extends rectangle1{
	void name3() {
		System.out.println("square is rectangle ");
	}
}

public class program_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square1 s= new square1();
		s.name();
		s.name1();
		s.name3();
	}

}
