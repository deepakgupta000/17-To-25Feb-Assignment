package com.Opps;

class Student{
    String name ;
    int rollNo ;
}
class Student1{
    String Name;
    String address;
    int RollNo;
    long PhoneNumber;
}
class Employee {
    String nAme;
    int emplyee_Id;

    Employee(int eid, String n) {
        emplyee_Id = eid;
        nAme = n;
    }
        public void showData() {
            System.out.print("EmpId = " + emplyee_Id + "  " + " Employee Name = " + nAme);
            System.out.println();
        }
    }
public class Assignment {

	public static void main(String[] args) {
        //1.) Create a class named 'Student' with String variable 'name' and integer variable 'roll_no' Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
        Student s = new Student();
        s.name = "John";
        s.rollNo = 2;
        System.out.println("Name is " + s.name + " and roll number is " + s.rollNo);

        // 2.)Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
        Student1 sc = new Student1();
        sc.Name = "sam";
        sc.RollNo = 36;
        sc.address = "Mhada colony L-189 Chandrapur , Maharashtra";
        sc.PhoneNumber = 8411828266l;
        System.out.println("Name is " + sc.Name + " Roll number is " + sc.RollNo + " address is " + sc.address + " and Phone number is " + sc.PhoneNumber);

        sc.Name = "John";
        sc.RollNo = 40;
        sc.address = "Near sai mandir MIDC road Chandrapur , Maharashtra";
        sc.PhoneNumber = 7020282507l;
        System.out.println("Name is " + s.name + " Roll number is " + sc.RollNo + " address is " + sc.address + " and Phone number is " + sc.PhoneNumber);

        Employee[] obj = new Employee[4] ;

        // 3.) Create a class 'Employee' with String variable 'name' and integer variable 'employee id'. Create 4 Employee objects and store in array and display.
        obj[0] = new Employee(100,"Akash");
        obj[1] = new Employee(101,"Ameer");
        obj[2] = new Employee(102,"Deepak");
        obj[3] = new Employee(103,"Neeraj");

        System.out.println("Employee Object 1:");
        obj[0].showData();
        System.out.println("Employee Object 2:");
        obj[1].showData();
        System.out.println("Employee Object 2:");
        obj[2].showData();
        System.out.println("Employee Object 2:");
        obj[3].showData();
    }
}
