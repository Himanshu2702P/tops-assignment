/*Write a program you have to print the Fibonacci series up to user given
number
*/
#include<stdio.h>
int main(){
	int n,i;
	
	int t1=0,t2=1,nextterm=t1+t2;
	
	printf("Enter the number of term \n");
	scanf("%d",&n);
	printf("Fibonacci Series: %d, %d, ", t1, t2);
	
	for (i = 3; i <= n; ++i) {
    printf("%d, ", nextterm);
    t1 = t2;
    t2 = nextterm;
    nextterm = t1 + t2;
  }
	return 0;
}
