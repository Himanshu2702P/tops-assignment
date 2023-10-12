#include <math.h>

int main()
{
    float principal, rate, time, CI,Amount;

    printf("Enter principal:");
    scanf("%f", &principal);

    printf("Enter time:");
    scanf("%f", &time);

    printf("Enter rate:");
    scanf("%f", &rate);

    Amount = principal* (pow((1 + rate / 100), time));
     CI= Amount-principal;

    printf("Compound Interest = %f", CI);

    return 0;
}
