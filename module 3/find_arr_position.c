//Write a Program of find the element of given position from the array
#include <stdio.h>

int main() {
    int arr[100],i, n, pos;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
 
    printf("Enter %d elements:\n", n);
    for ( i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
  
    printf("Enter the position of the element to find (0-indexed): ");
    scanf("%d", &pos);

    
    if (pos < 0 || pos >= n) {        // Check if the position is valid
        printf("Invalid position!\n");
    } else {
        printf("Element at position %d is %d\n", pos, arr[pos]);
    }

    return 0;
}

