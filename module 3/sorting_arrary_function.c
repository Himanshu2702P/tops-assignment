//Write a program to sort the numbers using pointer and functions
#include <stdio.h>
void swap(int *a, int *b) {					// Function to swap two numbers
    int temp = *a;
    *a = *b;
    *b = temp;
}
void bubbleSort(int *arr,int size) {	   // Function to perform bubble sort
    int i, j;
    for (i=0; i <size-1;i++) {
     for (j=0; j <size-i-1;j++) {
     if (*(arr + j) > *(arr + j + 1)) {
     swap(arr + j, arr + j + 1);
	        }
        }
    }
}
void printArray(int *arr, int size) {      // Function to print an array
    int i;
	for (i = 0; i < size; i++) {
        printf("%d ", *(arr + i));
    }
    printf("\n");
}

int main() {
    int size,i;
    printf("Enter the number of elements: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter %d elements:\n", size);
    for ( i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Original array: ");
    printArray(arr, size);

    bubbleSort(arr, size);		 // Sort the array

    printf("Sorted array: ");
    printArray(arr, size);

    return 0;
}

