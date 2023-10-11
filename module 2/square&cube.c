#include<stdio.h>
int main()
{
	int num,square,cube;
	printf("Enter Your Number =");
	scanf("%d",&num);
	
	square = num*num;
	printf("Square is %d\n",square);
	
	cube = num*num*num;
	printf("Cube is %d\n",cube);
	return 0;
}
