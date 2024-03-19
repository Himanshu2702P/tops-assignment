//Write a program to read data from file
#include <stdio.h>

int main() {
    FILE *file;
    char filename[100];
    char data[100];

    printf("Enter the name of the file: ");
    scanf("%s", filename);

    file = fopen(filename, "r");		  // Open the file in read mode

    if (file == NULL) {					   // Check if the file exists
        printf("File %s not found.\n", filename);
        return 1;
    }

    printf("Data from file %s:\n", filename); // Read data from the file and print it
    while (fgets(data, sizeof(data), file) != NULL) {
        printf("%s", data);
    }

    fclose(file);								 // Close the file

    return 0;
}

