#include<stdio.h>
int main()
{
	int P,R,T;
	printf("Enter Principal = ");
	scanf("%d",&P);

    printf("Enter Rate = ");
	scanf("%d",&R);
	
	printf("Enter Time = ");
	scanf("%d",&T);
	
	SI=(P*R*T)/100;	
	printf("Simple interest is %d",SI);
	return 0;
}
