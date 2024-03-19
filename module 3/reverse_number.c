/*Write a program to print the number in reverse order.*/
#include <stdio.h>

int main() {

  int n, reverse = 0, remainder;

  printf("Enter an integer: ");
  scanf("%d", &n);

  while (n != 0) {
    remainder = n % 10;					//252 % 10 =52(rem) | 52 % 10=2(rem)
    reverse = reverse * 10 + remainder; //
    n /= 10;							//
  }

  printf("Reversed number = %d", reverse);

  return 0;
}
