//Write program to make an addition of two number using pointer
#include <stdio.h>

int main() {
    int num1,num2,sum;
    int *ptr1,*ptr2;

    printf("Enter first number: ");
    scanf("%d",&num1);

    printf("Enter second number: ");
    scanf("%d",&num2);

     // Assign the addresses of num1 and num2 to ptr1 and ptr2 respectively
    ptr1 = &num1;
    ptr2 = &num2;

    sum = *ptr1 + *ptr2;

    printf("Sum of %d and %d is %d\n", *ptr1,*ptr2,sum);

    return 0;
}

