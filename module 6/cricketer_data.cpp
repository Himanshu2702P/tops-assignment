/*Assume a class cricketer is declared. Declare a derived class batsman from
cricketer .Data member of batsman. Total runs, Average runs and best
performance. Member functions input data, calculate average runs, Display
data. (Single Inheritance)*/
#include<iostream>
#include<string>

using namespace std;

class Cricketer{
	protected:
		string name;
		int age;
	public:
		void inputData(string n,int a){
			name=n;
			age=a;	
		}
	
};

class Batsman : public Cricketer{
	private:
		int totalruns;
		float avgruns;
		int bestperformance;
		
	public:
		void inputBatsmanData(int runs,int best){
		totalruns=runs;
		bestperformance=best;
		calculateAvgruns();
		}
		
		void calculateAvgruns(){
		
			avgruns=static_cast<float>(totalruns)/5;
		}
		
		void displayData() {
			
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Total Runs: " << totalruns << endl;
        cout << "Average Runs: " << avgruns << endl;
        cout << "Best Performance: " << bestperformance << endl;
    }
};

int main(){
	Batsman batsman;
	batsman.inputData("kohli",34);
	batsman.inputBatsmanData(250,100);
	batsman.displayData();
	
	return 0;
}
