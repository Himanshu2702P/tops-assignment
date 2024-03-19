//prime number check
#include<stdio.h>
int main(){
	int num,i;
	printf("Enter number to check is it prime or not : ");
	scanf("%d",&num);
	
	int count=0;
	
	for(i=2;i<num;i++){
		if(num % i== 0)
		count++;
	}
	
	 if(num==1){
		printf("1 is neither prime nor composite");
	}
	else if(count == 0)           //Check whether Prime or not
    {
        printf("%d is a prime number.", num);
    }
    else
    {
        printf("%d is not a prime number.", num);
    }
    
	return 0;
}
