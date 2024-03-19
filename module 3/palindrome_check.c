//Write a Program of Print a number and check the number is palindrome or
//not using recursive Function
#include <stdio.h>

// Function to check if a number is palindrome
int isPalindrome(int num,int reversedNum) {
    if(num == 0) {
        return reversedNum;
    }
    reversedNum = reversedNum * 10 + num % 10;
    return isPalindrome(num / 10, reversedNum);
}

int main() {
    int num,reversedNum = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    reversedNum=isPalindrome(num, reversedNum);

    if(num == reversedNum) {
        printf("%d is a palindrome number.\n", num);
    } else {
        printf("%d is not a palindrome number.\n", num);
    }

    return 0;
}

