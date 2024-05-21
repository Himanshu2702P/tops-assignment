//Define a class to represent a bank account
#include<iostream>
#include<string.h>
using namespace std;

class bankaccount{
	private:
		string depositorName;
		int accountNumber;
   	    string accountType;
    	double balance;
    	
    	public:
    		//constructor
    	bankaccount(string name,int accNum,string accType,double initialBalance){
    		
    	depositorName = name;
        accountNumber = accNum;
        accountType = accType;
        balance = initialBalance;
		}
		// Function to deposit an amount
		void deposit(double amount){
			balance += amount;
       		 cout << "Deposited: " << amount << endl;
		}
		 // Function to withdraw an amount
		void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            cout << "Withdrawn: " << amount << endl;
        } else {
            cout << "Insufficient balance" << endl;
        }
    }
    	void display(){
    	
    		
    	cout << "Depositor Name: " << depositorName << endl;
    	cin>>depositorName;
        cout << "Account Number: " << accountNumber << endl;
        cin>>accountNumber;
        cout << "Account Type: " << accountType << endl;
        cin>>accountType;
        cout << "Balance: " << balance << endl;
        cin>>balance;
		}
};

int main(){
	bankaccount acc("Himanshu",12345,"Saving",10000.0);
		
	acc.deposit(500.0);
    acc.withdraw(1000.0);
    
	acc.display();


    return 0;
}





