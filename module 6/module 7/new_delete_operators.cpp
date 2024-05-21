//Create an example of


using namespace std;

int main() {
    // Dynamically allocate memory for an array of 5 integers
    int* array = new int[5];

    // Check if memory allocation was successful
    if (array == nullptr) {
        cout << "Memory allocation failed!" << endl;
        return 1;
    }

    // Assign values to the dynamically allocated array
    for (int i = 0; i < 5; ++i) {
        array[i] = i + 1;
    }

    // Print the values of the dynamically allocated array
    cout << "Dynamically allocated array values:" << endl;
    for (int i = 0; i < 5; ++i) {
        cout << array[i] << " ";
    }
    cout << endl;

    // Deallocate the dynamically allocated memory
    delete[] array;

    // Set pointer to nullptr after deallocation
    array = nullptr;

    return 0;
}

