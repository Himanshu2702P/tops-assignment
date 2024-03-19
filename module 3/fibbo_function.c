//Write a program you have to print the Fibonacci series using function
#include<stdio.h>
void fibo(int n){
    int i, t1=0, t2=1, nextTerm;
    
    printf("Fibonacci series up to %d terms:\n", n);
    printf("%d %d", t1, t2); // Print first two terms
    
    for(i=3; i<=n; i++){ // Start from the 3rd term
        nextTerm = t1 + t2;
        printf(" %d", nextTerm);
        
        t1 = t2;
        t2 = nextTerm;
    }
    printf("\n");
}
int main(){
    int numTerms;
    printf("Enter number of terms: ");
    scanf("%d", &numTerms);
    
    if(numTerms<=0){
        printf("Number of terms should be greater than 0 \n");
    }
    else{
        fibo(numTerms);
    }
    return 0;
}

