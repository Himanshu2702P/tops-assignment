//Write a Program to check the given year is leap year or not
#include<stdio.h>
int main(){
	int year;
	printf("Enter a year to check leap year : ");
	scanf("%d",&year);
	
	if(year % 400 == 0){
		printf("\n%d  is a leap year",year);
	}
	else if(year % 100 == 0){
		printf("\n%d  is not a leap year ",year);
	}
	else if(year % 4 == 0){
			printf("\n%d  is a leap year ",year);
	}
	else
	{ 	printf("\n%d  is not a leap year ",year);
	}
	return 0;
}
