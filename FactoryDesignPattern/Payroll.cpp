#include <iostream>
#include<cstring>
#include<fstream>
#include "EmployeeFactory.cpp"

using namespace std;
// ifstream input("input.txt");


int main(int argc, char* const argv[]){
    fstream fin(argv[1], fstream::in);
    Employee *e;
    char ch;
    char buffer[1];
    fin.read(buffer, sizeof(buffer));
    ch = buffer[0];
    while (!fin.eof()) {
        e = EmployeeFactory::createEmployee(ch);
        e -> readData(&fin);
        e-> writeEmpId();
        e-> writeDeptId();
        e-> calculateNet();
        e -> writeMyData();
        fin >> ch;
}
}
