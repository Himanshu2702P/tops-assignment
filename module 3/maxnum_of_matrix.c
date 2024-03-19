//Write a program to find out the Max number from given Matrix 
#include<stdio.h>
int main(){
	int matrix[50][50];
	int r,c,i,j,maximum;
	
	printf("Enter number of row & columns in matrix: \n");
	scanf("%d %d",&r,&c);
	
	printf("Enter elements of matrix\n");
		for(i=0;i<r;i++)
		for(j=0;j<c;j++)
		scanf("%d",&matrix[i][j]);
	
	maximum=matrix[0][0];

	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
		if(matrix[i][j]>maximum)
		
		maximum=matrix[i][j];
		
		printf("Maximum element in the matrix is %d\n", maximum);
			
	return 0;
}
