//Write a program to copy string from one string to another string with user
//define function
#include <stdio.h>

// Function to copy a string from source to destination
void stringCopy(char *source, char *destination) {
    while (*source) {
        *destination = *source;
        source++;
        destination++;
    }
    *destination = '\0'; // Adding null terminator at the end
}

int main() {
    char source[100], destination[100];

    printf("Enter a string: ");
    scanf("%s", source);

    stringCopy(source, destination);

    printf("Source string: %s\n", source);
    printf("Destination string: %s\n", destination);

    return 0;
}

