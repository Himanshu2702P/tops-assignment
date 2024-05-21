//Write a program to read and write data in to file in 
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    // Open a file for writing
    ofstream outFile("data.txt");

    if (!outFile.is_open()) {
        cout << "Error opening file!";
        return 1;
    }

    // Read data from the user
    string data;
    cout << "Enter data to write into the file (type 'exit' to stop):\n";
    while (true) {
        getline(cin, data);
        if (data == "exit") {
            break;
        }
        outFile << data << endl;
    }

    // Close the file
    outFile.close();

    cout << "Data has been written to file 'data.txt' successfully." << endl;

    return 0;
}

