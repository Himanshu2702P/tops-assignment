//Write a program to find out the factorial of given number using function
#include<stdio.h>
int fact(int n){
	if(n==0 || n==1){
		return 1;
	}
	else{
		return n*fact(n-1);
	}
}
int main(){
	
	int num;
	printf("enter number : ");
	scanf("%d",&num);
	
	if (num<0){
		printf("Enter valid number");
	}
	else
	{printf("factorial of %d = %d",num,fact(num));
	}
	return 0;
}
