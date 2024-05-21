/*Write a program of find the simple interest using constructor with dynamic
initialization. Make constructor like Interest (int principal, int year, int rate)
Interest (int principal, int year, float rate = 2.5) */
#include<iostream>
using namespace std;

class Interest{
private:
	int principal;
	int year;
	float rate;
public:
	Interest(int p,int y,float r= 2.5){
	principal = p;
	year = y;
	rate = r;
	}
	
	// Function to calculate simple interest
    float calculateSimpleInterest() {
        return (principal * year * rate) / 100;
    }
};

int main(){
	int principal,year;
	float rate;
	
	 cout << "Enter principal amount: ";
    cin >> principal;

    cout << "Enter number of years: ";
    cin >> year;

    cout << "Enter rate of interest (default is 2.5): ";
    cin >> rate;
    
      Interest obj(principal, year, rate);
    float simpleInterest = obj.calculateSimpleInterest();

    cout << "Simple Interest: " << simpleInterest << endl;
	return 0;
}
