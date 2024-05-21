/*Write a program to find the multiplication values and the cubic values using
inline function.*/
#include<iostream>

inline int multiply(int a,int b){
	return a*b;
}

inline int multiply(int a){
	return a*a*a;
}
int main(){
	int x,y;
	std::cout<<"value of X :";
	std::cin>>x;
	std::cout<<"value of Y :";
	std::cin>>y;
	// Using inline functions
	 std::cout << "Using inline functions:" << std::endl;
    std::cout << "Multiplication of " << x << " and " << y << " is: " << multiply(x, y) << std::endl;
    std::cout << "Cubic value of " << x << " is: " << multiply(x) << std::endl;

    return 0;
}
