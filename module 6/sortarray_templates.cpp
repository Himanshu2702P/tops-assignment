// Write a program of to sort the array using templates. 
#include <iostream>

using namespace std;

template<typename T>
void swap(T &a, T &b) {
    T temp = a;
    a = b;
    b = temp;
}

template<typename T>
void bubbleSort(T arr[], int size) {
    for (int i = 0; i < size - 1; ++i) {
        for (int j = 0; j < size - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr [j + 1]);
            }
        }
    }
}

template<typename T>
void displayArray(T arr[], int size) {
    for (int i = 0; i < size; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    // Integer array
    int intArr[] = {5, 2, 7, 3, 1};
    int intSize = sizeof(intArr) / sizeof(int);

    cout << "Before sorting (Integer array): ";
    displayArray(intArr, intSize);

    bubbleSort(intArr, intSize);

    cout << "After sorting (Integer array): ";
    displayArray(intArr, intSize);

    // Double array
    double doubleArr[] = {3.14, 2.71, 1.618, 0.577, 0.333};
    int doubleSize = sizeof(doubleArr) / sizeof(double);

    cout << "\nBefore sorting (Double array): ";
    displayArray(doubleArr, doubleSize);

    bubbleSort(doubleArr, doubleSize);

    cout << "After sorting (Double array): ";
    displayArray(doubleArr, doubleSize);

    // Character array
    char charArr[] = {'c', 'b', 'a', 'e', 'd'};
    int charSize = sizeof(charArr) / sizeof(char);

    cout << "\nBefore sorting (Character array): ";
    displayArray(charArr, charSize);

    bubbleSort(charArr, charSize);

    cout << "After sorting (Character array): ";
    displayArray(charArr, charSize);

    return 0;
}

