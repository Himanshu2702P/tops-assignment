package assignment;
/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are 
subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classe*/
abstract class bank{
	abstract void getBalance();
}
class bankA extends bank{

	@Override
	void getBalance() {
		System.out.println("100$ deposited in bankA");
	}
	
}
class bankB extends bank{

	@Override
	void getBalance() {
		System.out.println("200$ deposited in bankB");
	}
	
}
class bankC extends bank{

	@Override
	void getBalance() {
		System.out.println("300$ deposited in bankC");
	}
	
}
public class program_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankA b1 = new bankA();
		b1.getBalance();
		bankB b2 = new bankB();
		b2.getBalance();
		bankC b3 = new bankC();
		b3.getBalance();
		
	}

}
