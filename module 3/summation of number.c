//Write a program make a summation of given number
#include<stdio.h>
int main(){
	int num,sum=0,digit;
	printf(" Enter your number");
	scanf("%d",&num);
	
	 while (num != 0) {
        digit = num % 10;
        sum += digit;
        num /= 10;
    }

    printf("Sum of digits = %d\n", sum);

	return 0;
}
