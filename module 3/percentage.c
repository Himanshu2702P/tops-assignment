/*
Write a program user enter the 5 subjects mark. You have to make a total and
find the percentage
*/
#include<stdio.h>
int main(){
	int sub1,sub2,sub3,sub4,sub5,total;
	float percentage;
	printf("Enter subject1 marks : ");
	scanf("%d",&sub1);
	
		printf("Enter subject2 marks : ");
	scanf("%d",&sub2);
	
		printf("Enter subject3 marks : ");
	scanf("%d",&sub3);
	
		printf("Enter subject4 marks : ");
	scanf("%d",&sub4);
	
		printf("Enter subject5 marks : ");
	scanf("%d",&sub5);
	
	total=sub1+sub2+sub3+sub4+sub5;
	percentage=(total/500.0)*100.0;
	
	printf("your percentage is : %.2f \n",percentage);
	
	if (percentage>75){
		printf("Distinction");
	}
	else if(percentage<=75 && percentage>60){
		printf("first class");
	}
	else if(percentage<=60 && percentage>50){
		printf("second class");
	}
	else if(percentage<=50 && percentage>35){
		printf("pass class");
	}
	else
	{
		printf("fail");
	}
	return 0;
}
