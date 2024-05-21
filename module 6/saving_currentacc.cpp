/*Assume that a bank maintains two kinds of accounts for customer, one called
as saving account and other as current accounts provides Simple interest and
withdraw facilities but no Cheque book facility.

a) The current account provides Cheque book facility but no interest.

b) Current account holders should maintain a minimum balance and if the
balance falls below this level a service charges is imposed
*/
#include<iostream>
#include<string>

using namespace std;

class Account{
	protected:
		string accNumber;
		string accHoldername;
		float balance;
		
	public:
		Account(){}
		Account(string number,string name,float initialBalance):accNumber(number),accHoldername(name),balance(initialBalance){}
	
		virtual void deposit(float amount){
			balance += amount;
			cout << "Deposited: " << amount << endl;
		}	
	
		virtual void withdraw(float amount){
			if (balance - amount >= 0){
				balance -= amount;
				cout << "Withdrawn: " << amount << endl;
			}
			else{
				cout << "Insufficient balance" << endl;
			}
		}
	
		virtual void displayBalance(){
			cout << "Account Balance: " << balance << endl;
		}
		virtual ~Account() {}
};

class SavingsAccount: public Account{
	private :
		float interestRate;
	
	public:
		SavingsAccount(string number,string name,float initialBalance,float rate): Account(number,name,initialBalance), interestRate(rate) {}
	
		virtual void addInterest(){
			float interest = balance * (interestRate/100);
			balance += interest;
			cout << "Added interest: " << interest << endl;
		}		
};

class CurrentAccount: public Account{
	private:
		float minimumBalance;
		float serviceCharge;
	
	public:
		CurrentAccount(string number,string name,float initialBalance,float minBal,float charge): Account(number,name,initialBalance), minimumBalance(minBal), serviceCharge(charge) {}
	
		virtual void withdraw(float amount) override {
			if (balance - amount >= minimumBalance) {
				balance -= amount;
				cout << "Withdrawal successful.\n";
			} else {
				cout << "Withdrawal failed: Below minimum balance.\n";
			}
		}

		void deductServiceCharge() {
			if (balance < minimumBalance) {
				balance -= serviceCharge;
				cout << "Service charge deducted.\n";
			}
		}
};

int main(){
	
	
	SavingsAccount savings("SA12345", "John Doe", 1000.0, 5.0);
	CurrentAccount current("CA54321", "Jane Smith", 2000.0, 500.0, 10.0);

	savings.deposit(500.0);
	savings.addInterest();
	savings.displayBalance();
	
	current.withdraw(1500.0);
	current.deductServiceCharge();
	current.displayBalance();

	return 0;
}

