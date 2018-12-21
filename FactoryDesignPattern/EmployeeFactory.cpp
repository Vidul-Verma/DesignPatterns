#include <iostream>
#include<cstring>
#include<fstream>
#include "Employee.cpp"
using namespace std;
class EmployeeFactory{
public:
    static Employee * createEmployee(char type){
        Employee *emp = NULL;
        if(type == '1'){
            emp = new Salaried;
        }else if(type == '2'){
            emp = new Hourly;
        }else if(type == '3'){
            emp = new Commissioned;
        }
        return emp;
    }
};
