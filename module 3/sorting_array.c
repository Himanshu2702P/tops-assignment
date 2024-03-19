//? Write a program to sort the array of 5 elements
#include<stdio.h>
int main(){
	int num[20];
	int n,i,j,a;
	
	printf("Enter number of elements in array : \n");
	scanf("%d",&n);
	printf("Enter elements : \n");
	
	for(i=0;i<n;i++)
	   scanf("%d",&num[i]);
	   
	for(i=0; i<n; i++){
		for(j=i+1; j<n; j++){
			if(num[i] > num[j]){
				a=num[i];
				  num[i] = num[j];
          		  num[j] = a;
			}
		}
	}
	
	    printf("The numbers in ascending order is: ");
   		for (i = 0; i < n; i++){
        printf("%d", num[i]);
   }
	return 0;
}
