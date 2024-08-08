package assignment;
/*Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class 
 */
class parent{
	public void displayParent() {
		System.out.println("this is parent class");
	}
	
}
class child extends parent{
	public void displayChild() {
		System.out.println("this is child class");
	}
}

public class program_21 {
	public static void main(String[] args) {
		
		parent ps = new parent();
		ps.displayParent();
		
		child c = new child();
		c.displayChild();
		
		c.displayParent();
	}
	
}
