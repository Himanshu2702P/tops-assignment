package assignment;
/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints 
the salary of the members. 
 * */
class member{
	String data_member;
	String name ;
	int age ;
	int number;
	String address;
	int salary;
	
	public void printsalary() {
		System.out.println("33000");
	}
}

public class program_22 {
	public static void main(String[] args) {
		member m = new member();
		m.printsalary();
		
	}
}
