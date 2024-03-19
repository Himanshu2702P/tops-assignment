/*Write a program of structure for five employee that provides the following
information print and display empno, emp*/
#include <stdio.h>
#include <string.h>

int main() {
    int empno[5];
    char empname[5][50];
    char address[5][100];
    int age[5];
    int i;

    // Input employee information
    for (i = 0; i < 5; i++) {
        printf("\nEnter employee %d details:\n", i + 1);
        printf("Employee Number: ");
        scanf("%d", &empno[i]);
        
        printf("Employee Name: ");
        scanf("%s", empname[i]);
        
        printf("Address: ");
        scanf("%s", address[i]);
        
        printf("Age: ");
        scanf("%d", &age[i]);
    }

    // Print employee information
    printf("\nEmployee Information:\n");
    for (i = 0; i < 5; i++) {
        printf("Employee %d\n", i + 1);
        printf("Employee Number: %d\n", empno[i]);
        printf("Employee Name: %s\n", empname[i]);
        printf("Address: %s\n", address[i]);
        printf("Age: %d\n\n", age[i]);
    }

    return 0;
}

