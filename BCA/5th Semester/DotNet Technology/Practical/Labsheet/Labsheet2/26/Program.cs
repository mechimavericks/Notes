// Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 – Salary
// It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and // // 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

using System;
class Member{
    public  string Name,PhoneNumber,Address;
    public  int Age,Salary;
    public void PrintSalary(){
        Console.WriteLine("Salary: " + Salary);
    }
}
class Employee : Member{
    public string Specialization;
}
class Manager : Member{
    public string Department;
}
class Program{
    static void Main(){
        Employee e = new Employee();
        e.Name = "John";
        e.Age = 30;
        e.PhoneNumber = "1234567890";
        e.Address = "123, Street";
        e.Salary = 50000;
        e.Specialization = "Software Developer";
        Console.WriteLine($"Employee Details:\nName : {e.Name}\nAge : {e.Age}\nPhone Number : {e.PhoneNumber}\nAddress : {e.Address}");
        e.PrintSalary();
        Console.WriteLine("Specialization: " + e.Specialization);
        Manager m = new Manager();
        m.Name = "Jane";
        m.Age = 35;
        m.PhoneNumber = "0987654321";
        m.Address = "456, Avenue";
        m.Salary = 100000;
        m.Department = "IT";
        Console.WriteLine($"Manager Details:\nName : {m.Name}\nAge : {m.Age}\nPhone Number : {m.PhoneNumber}\nAddress : {m.Address}");
        m.PrintSalary();
        Console.WriteLine("Department: " + m.Department);
    }
}