package assignment;
/*We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and print the percentage of marks for
both the students. */

abstract class marks{
	abstract double getPercentage();
}
class studentA extends marks{

	private double sub1;
	private double sub2;
	private double sub3;
	
	public studentA(double sub1,double sub2,double sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	@Override
	double getPercentage() {
		double total=sub1+sub2+sub3;
		return (total/300)*100;
	}
}

class studentB extends marks{
	private double sub1;
	private double sub2;
	private double sub3;
	private double sub4;
	
	public studentB(double sub1,double sub2,double sub3,double sub4) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	@Override
	double getPercentage() {
	double	total=sub1+sub2+sub3+sub4;
		return (total/400)*100;
	}
}
public class program_29 {

	public static void main(String[] args) {
		
		studentA sA = new studentA(70.0, 80.0, 77.0);
		System.out.println("studentA : "+sA.getPercentage()+"%");
		
		
		
		studentB sB = new studentB(88.0,90.0,70.0,67.0);
		System.out.println("studentB : "+sB.getPercentage()+"%");
		
	}

}
