//Write a program to concatenate the two string using pointer
#include <stdio.h>
void concat(char *str1, char *str2) {		// Function to concatenate two strings
    
    while(*str1) {						 	// Move the pointer to the end of str1
        str1++;
    }

    while(*str2) {							  // Copy characters from str2 to str1
        *str1 = *str2;
        str1++;
        str2++;
    }
    *str1 = '\0';							// Add null terminator at the end
}

int main() {
    char str1[100],str2[100];

    printf("Enter first string: ");
    scanf("%s", str1);

    printf("Enter second string: ");
    scanf("%s", str2);

    concat(str1, str2);					 // Call concat function to concatenate str2 to str1
    printf("Concatenated string: %s\n", str1);

    return 0;
}

