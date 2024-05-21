/*Write a Program of Two 1D Matrix Addition using Operator Overloading*/
#include<iostream>
class Matrix{
	private:
		int *arr;
		int size;
	public:
		Matrix(int s){		//constructor
			size=s;
			arr=new int[size];
		}
		~Matrix(){			//destructor
			delete[]arr;
			}
	// Overloading + operator for matrix addition			
	Matrix operator+(const Matrix &m){
		Matrix result(size);
		for(int i=0;i<size;i++){
			 result.arr[i] = arr[i] + m.arr[i];
		}
		return result;
	}
	 // Function to set values in the matrix
	 void setvalue(){
	 	std::cout<<"Enter"<<size<<"value";
	 	for(int i=0;i<size;i++){
	 		std::cin>>arr[i];
		 }
	 }
	 // Function to display the matrix
	 void display(){
	 	for (int i = 0; i < size; i++) {
            std::cout << arr[i] << " ";
        }
        std::cout << std::endl;
	 }
};

int main(){
	int size;
	
	std::cout << "Enter the size of the matrices: ";
    std::cin >> size;

    Matrix mat1(size), mat2(size), result(size);

    std::cout << "Enter values for matrix 1:" << std::endl;
    mat1.setvalue();

    std::cout << "Enter values for matrix 2:" << std::endl;
    mat2.setvalue();

    // Adding two matrices using operator overloading
    result = mat1 + mat2;

    std::cout << "Matrix 1:" << std::endl;
    mat1.display();

    std::cout << "Matrix 2:" << std::endl;
    mat2.display();

    std::cout << "Resultant Matrix:" << std::endl;
    result.display();

    return 0;
}
