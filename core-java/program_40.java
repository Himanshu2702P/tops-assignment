package assignment;
import java.util.Scanner;
/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount 
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction. */
 class bankAccount{
	private double balance;
	
	public bankAccount(double balance) {
		this.balance=balance;
	}

	public void withdraw(double amount)throws Exception {
		if(amount>balance) {
			System.out.println("Sorry, insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("Withdrawal successful. Remaining balance: " + balance);
		}
	}
	public double getBalance(){
		return balance;
	}
 
 }
public class program_40 {
		
	public static void main(String[] args) {
		bankAccount account = new bankAccount(2000);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("your bank Balance "+account.getBalance());
		
		System.out.println("Enter your amount");
		double withdrawAmount = sc.nextDouble();
		
		try {	
			   account.withdraw(withdrawAmount);
			
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
		sc.close();
		}
	
	}
 
