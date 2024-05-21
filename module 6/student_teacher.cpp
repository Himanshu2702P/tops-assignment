/*Create a class person having members name and age. Derive a class student
having member percentage. Derive another class teacher having member
salary. Write necessary member function to initialize, read and write data.
Write also Main function (Multiple Inheritance) */
#include <iostream>
#include <string>

using namespace std;

class Person {
protected:
    string name;
    int age;
public:
    Person() {}
    Person(string n, int a) : name(n), age(a) {}

    void readData() {
        cout << "Enter name: ";
        cin >> name;
        cout << "Enter age: ";
        cin >> age;
    }

    void writeData() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
};

class Student : public Person {
private:
    float percentage;
public:
    Student() {}
    Student(string n, int a, float p) : Person(n, a), percentage(p) {}

    void readStudentData() {
        readData();
        cout << "Enter percentage: ";
        cin >> percentage;
    }

    void writeStudentData() {
        writeData();
        cout << "Percentage: " << percentage << "%" << endl;
    }
};

class Teacher : public Person {
private:
    float salary;
public:
    Teacher() {}
    Teacher(string n, int a, float s) : Person(n, a), salary(s) {}

    void readTeacherData() {
        readData();
        cout << "Enter salary: ";
        cin >> salary;
    }

    void writeTeacherData() {
        writeData();
        cout << "Salary: Rupees" << salary << endl;
    }
};

int main() {
    Student student;
    cout << "Enter student details:" << endl;
    student.readStudentData();
    cout << endl;

    Teacher teacher;
    cout << "Enter teacher details:" << endl;
    teacher.readTeacherData();
    cout << endl;

    cout << "Student details:" << endl;
    student.writeStudentData();
    cout << endl;

    cout << "Teacher details:" << endl;
    teacher.writeTeacherData();
    cout << endl;

    return 0;
}

