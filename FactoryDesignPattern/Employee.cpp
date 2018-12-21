#include <iostream>
#include<cstring>
#include<fstream>
#include <cstdlib>
#include<string>
using namespace std;

class Employee{
protected:
    int type;
    char emp_id[12];
    char dept_id[5];
    double net;
public:
    virtual void readData(fstream* fin) = 0;
    virtual void calculateNet() = 0;
    virtual void writeMyData() = 0;
    void readEmployeeInfo(fstream* fin){
        *fin >> emp_id;
        *fin >> dept_id;
    }

    void writeEmpId(){
        cout << "Employee_id# " << emp_id << "  ";
        // return emp_id;
    }
    void writeDeptId(){
        cout << "Dept# " << dept_id << "  ";
        // return dept_id;
    }
};

class Salaried : public Employee{
public:
    double salary;
    void readData(fstream* fin){
        Employee::readEmployeeInfo(fin);
        string temp;
        string sal;
        *fin >> sal;
        salary = atof(sal.c_str());
    };
    double writeSalary(){
        return salary;
    };

    void calculateNet(){
        cout<< "Net_Pay: $" << salary/12 << "   ";
        // return salary/12;
    }

    void writeMyData(){
        cout << "Salary: $" << writeSalary() << endl;
    }
};

class Hourly : public Employee{
public:
    double rate;
    double hours;

    void readData(fstream* fin){

        Employee::readEmployeeInfo(fin);

        string rt;
        string hr;
        *fin >> hr;
        hours = atof(hr.c_str());
        *fin >> rt;
        rate = atof(rt.c_str());

    };


    double writeRate(){
        return rate;
    }

    double writeHours(){
        return hours;
    }

    void writeMyData(){
        cout << "Hours: " << writeHours() << "   Rate: $" << writeRate() <<endl;
    }

    void calculateNet(){
        if(hours > 40){
            cout<< "Net_Pay: $" << 40*rate + (hours-40)*rate*1.5 << "   ";
            // return 40*rate + (hours-40)*rate*1.5;
        }else{
            cout<< "Net_Pay: $" << hours*rate << "   ";
        }

    }

};

class Commissioned : public Employee{
public:
    double sales;

    void readData(fstream* fin){
        Employee::readEmployeeInfo(fin);

        string sl;
        *fin >> sl;
        sales = atof(sl.c_str());
    };

    double writeSales(){
        return sales;
    }

    void writeMyData(){
        cout << "Sales: $" << writeSales() << endl;
    }

    void calculateNet(){

        if(sales <= 15000){
            cout<< "Net_Pay: $" << sales * 12 / 100 << "   ";
            // return sales * 12 / 100;
        }else if(sales > 15000 && sales <= 25000){
            cout<< "Net_Pay: $" << 15000*12/100 + (sales-15000)*15/100 << "   ";
            // return 15000*12/100 + (sales-15000)*15/100;
        }else if(sales >25000){
            cout<< "Net_Pay: $" << 15000*12/100 + 10000*15/100 + (sales-25000)*20/100 << "   ";
            // return 15000*12/100 + 10000*15/100 + (sales-25000)*20/100;
        }
    }


};
