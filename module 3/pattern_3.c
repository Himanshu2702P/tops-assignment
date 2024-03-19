/*
	****
	 ***
	  **
	   *
*/
#include <stdio.h> 
  
int main() 
{   int i,j,k;

    // first loop for printing all rows 
    for ( i = 0; i < 4; i++) { 
  
        // first inner loop for printing white spaces 
        for ( j = 0; j < 2 * i; j++) { 
            printf(" "); 
        } 
  
        // second inner loop for printing star * 
        for ( k = 0; k < 4 - i; k++) { 
            printf("* "); 
        } 
        printf("\n"); 
    } 
  
    return 0 ;
	
}
