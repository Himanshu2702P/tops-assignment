/*Write a program of to find out the Area of Triangle, Rectangle and Circle
using Switch Case*/
#include<stdio.h>
int main(){
	int choice;
	float base,height,area,breadth,length,radius;
	printf("---------------------\n");
	printf("1. Triangle\n");
	printf("2. Rectangle\n");
	printf("3. Circle\n");
	printf("Select your choice above three\n");
	scanf("%d",&choice);
	
	switch(choice){
		case 1:
			printf("Enter base & height for Triangle\n");
			scanf("%f %f",&base,&height);
		area=0.5*base*height;
		printf("Area of Triangle = %f \n",area);
		break;
		
		case 2:
			printf("Enter breadth and length\n");
			scanf("%f %f",&breadth,&length);
		area=breadth*length;
		printf("Area of Rectangle = %f\n",area);
		break;
		
		case 3:
			printf("Enter radius \n ");
			scanf("%f",&radius);
		area=radius*radius;
		printf("Area of circle = %f\n",area);
		break;
		
		default:
			printf("Enter valid choice");
			break;		
	}
	return 0;
}
