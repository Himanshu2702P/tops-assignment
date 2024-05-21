//Write a program of to swap the two values using templates
#include <iostream>

using namespace std;

template <typename T>
void swapValues(T& a, T& b) {
    T temp = a;
    a = b;
    b = temp;
}

int main() {
    int int1 = 5, int2 = 10;
    double double1 = 3.14, double2 = 6.28;
    char char1 = 'A', char2 = 'B';

    cout << "Before swapping:\n";
    cout << "Integers: " << int1 << " " << int2 << endl;
    cout << "Doubles: " << double1 << " " << double2 << endl;
    cout << "Characters: " << char1 << " " << char2 << endl;

    swapValues(int1, int2);
    swapValues(double1, double2);
    swapValues(char1, char2);

    cout << "\nAfter swapping:\n";
    cout << "Integers: " << int1 << " " << int2 << endl;
    cout << "Doubles: " << double1 << " " << double2 << endl;
    cout << "Characters: " << char1 << " " << char2 << endl;

    return 0;
}

