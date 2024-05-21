/* Create a class account that stores customer name, account number and
type of account. From this derive classes curr_acc and sav_acct to make
them more specific to their requirements Include necessary member
functions in order to achieve the following tasks
a) Accepts deposit from a customer and update balance.
b) Display the balance.
c) Compute and deposit interest.
d) Permit withdraws and updates the balance.
e) Check for the minimum balance, impose penalty, necessary and
update the balance.*/
#include <iostream>
#include <string>

class Account {
protected:
    std::string customerName;
    int accountNumber;
    std::string accountType;
    double balance;

public:
    Account(std::string name, int accNo, std::string accType, double initialBalance)
        : customerName(name), accountNumber(accNo), accountType(accType), balance(initialBalance) {}

    void deposit(double amount) {
        balance += amount;
        std::cout << "Deposit successful. Updated balance: " << balance << std::endl;
    }

    void displayBalance() const {
        std::cout << "Current balance: " << balance << std::endl;
    }

    virtual void computeAndDepositInterest() = 0;

    virtual void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            std::cout << "Withdrawal successful. Updated balance: " << balance << std::endl;
        } else {
            std::cout << "Insufficient funds. Withdrawal failed." << std::endl;
        }
    }

    virtual void checkMinimumBalance() = 0;
};

class CurrAcc : public Account {
private:
    const double minimumBalance = 1000.0;
    const double penalty = 50.0;

public:
    CurrAcc(std::string name, int accNo, double initialBalance)
        : Account(name, accNo, "Current", initialBalance) {}

    void computeAndDepositInterest() override {
        // Current accounts typically do not have interest
        std::cout << "No interest computation for current accounts." << std::endl;
    }

    void checkMinimumBalance() override {
        if (balance < minimumBalance) {
            balance -= penalty;
            std::cout << "Minimum balance not maintained. Penalty imposed: " << penalty << std::endl;
            std::cout << "Updated balance after penalty: " << balance << std::endl;
        } else {
            std::cout << "Minimum balance maintained." << std::endl;
        }
    }
};

class SavAcct : public Account {
private:
    const double interestRate = 0.04; // 4% annual interest rate

public:
    SavAcct(std::string name, int accNo, double initialBalance)
        : Account(name, accNo, "Savings", initialBalance) {}

    void computeAndDepositInterest() override {
        double interest = balance * interestRate;
        balance += interest;
        std::cout << "Interest computed and deposited: " << interest << std::endl;
        std::cout << "Updated balance after interest: " << balance << std::endl;
    }

    void checkMinimumBalance() override {
        // Savings accounts might not have a penalty for not maintaining a minimum balance
        std::cout << "No minimum balance requirement for savings accounts." << std::endl;
    }
};

int main() {
    CurrAcc currentAccount("John Doe", 123456, 1200.0);
    currentAccount.deposit(300.0);
    currentAccount.displayBalance();
    currentAccount.withdraw(500.0);
    currentAccount.checkMinimumBalance();
    currentAccount.withdraw(1200.0);
    currentAccount.checkMinimumBalance();

    std::cout << std::endl;

    SavAcct savingsAccount("Jane Doe", 654321, 2000.0);
    savingsAccount.deposit(500.0);
    savingsAccount.displayBalance();
    savingsAccount.computeAndDepositInterest();
    savingsAccount.withdraw(1000.0);
    savingsAccount.displayBalance();
    savingsAccount.checkMinimumBalance();

    return 0;
}

