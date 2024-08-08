package assignment;
/*W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.*/

class ageNotWithinRangeException extends Exception{
		public ageNotWithinRangeException(String message) {
			super(message);
		}
}
class nameNotValidException extends Exception{
	public nameNotValidException(String message) {
		super(message);
	}
}

class student{
	private int rollno;
	private String name;
	private int age;
	private String course;
	
	public student(int rollno,String name,int age,String course)throws ageNotWithinRangeException,nameNotValidException {
		if(age<15 || age>21) {
			throw new ageNotWithinRangeException("Age not in the valid range");
		}
		
		if (!name.matches("[a-zA-Z]+")) {
	            throw new nameNotValidException("Name contains invalid characters");
	       }
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.course=course;		
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
}
	public class program_41 {
	public static void main(String[] args) {
	
		try {
            student student1 = new student(101, "John", 20, "Computer Science");
            System.out.println(student1);

            student student2 = new student(102, "Wick", 18, "Mathematics"); // This will throw NameNotValidException
            System.out.println(student2);

            student student3 = new student(103, "peter", 22, "Physics"); // This will throw AgeNotWithinRangeException
            System.out.println(student3);
            
        } catch (ageNotWithinRangeException | nameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
		
