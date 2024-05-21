/*Write a program of two concatenate the two strings using Operator
Overloading */
#include<iostream>
#include<cstring>

class Mystring{
	private:
		char*str;
		
	public:
		Mystring(const char *s = ""){
			str = new char[strlen(s) + 1];
			 strcpy(str, s);
		}
	~Mystring() {
        delete[] str;
    }
     // Overloading + operator for string concatenation
     Mystring operator+(const Mystring &s) {
        char *temp = new char[strlen(str) + strlen(s.str) + 1];
        strcpy(temp, str);
        strcat(temp, s.str);
        Mystring result(temp);
        delete[] temp;
        return result;
    }
    // Function to display the string
    void display() {
        std::cout << str << std::endl;
    }
};

int main(){
	
	Mystring s1("Hello, ");
    Mystring s2("world!");

    // Concatenating two strings using operator overloading
    Mystring result = s1 + s2;

    std::cout << "Concatenated string: ";
    result.display();

    return 0;
}
