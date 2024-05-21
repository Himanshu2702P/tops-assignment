/*Define a class to represent lecture details. Include the following members and
the program should handle at least details of 5 lecturer. 
Data members:
	a) Name of the lecturer
	b) Name of the subject
	c) Name of course
	d) Number of lecturers

Data functions:
	a) To assign initial values
	b) To add a lecture details
	c) To display name and lecture details */
#include <iostream>
#include <string>
using namespace std;

const int MAX_LECTURE_DETAILS = 5;

class LectureDetails {
private:
    string lecturerName;
    string subjectName;
    string courseName;
    int numLectures;
    string lectureDetails[MAX_LECTURE_DETAILS];

public:
    LectureDetails(string name, string subject, string course) {
        lecturerName = name;
        subjectName = subject;
        courseName = course;
        numLectures = 0;
    }

    void addLectureDetail(string detail) {
        if (numLectures < MAX_LECTURE_DETAILS) {
            lectureDetails[numLectures] = detail;
            numLectures++;
        } else {
            cout << "Maximum number of lecture details reached." << endl;
        }
    }

    void display() {
        cout << "Lecturer Name: " << lecturerName << endl;
        cout << "Subject Name: " << subjectName << endl;
        cout << "Course Name: " << courseName << endl;
        cout << "Number of Lectures: " << numLectures << endl;
        cout << "Lecture Details:" << endl;
 	for (int i = 0; i < numLectures; i++) {
            cout << "- " << lectureDetails[i] << endl;
        } 
        
    }
};

int main() {
    LectureDetails lecturer1("John Doe", "Mathematics", "Algebra");
    lecturer1.addLectureDetail("Introduction to Algebra");
    lecturer1.addLectureDetail("Linear Equations");

    LectureDetails lecturer2("Jane Smith", "Physics", "Mechanics");
    lecturer2.addLectureDetail("Introduction to Mechanics");
    lecturer2.addLectureDetail("Newton's Laws of Motion");
	
	 LectureDetails lecturer3("Jack", "Chemistry", "carbon");
    lecturer3.addLectureDetail("Introduction to carbon");
    lecturer3.addLectureDetail("Chemical Reactions");
    
     LectureDetails lecturer4("Bruce Wayne", "Biology", "Human body");
    lecturer4.addLectureDetail("Introduction to Biology");
    lecturer4.addLectureDetail("Human Anatomy");
    
     LectureDetails lecturer5("Parker", "Computer Science", "Basic Information");
    lecturer5.addLectureDetail("Introduction to Computer");
    lecturer5.addLectureDetail("Computer Programming");
    
    lecturer1.display();
    cout << endl;
    lecturer2.display();
    cout << endl;
     lecturer3.display();
    cout << endl;
     lecturer4.display();
    cout << endl;
     lecturer5.display();
    cout << endl;

    return 0;
}

