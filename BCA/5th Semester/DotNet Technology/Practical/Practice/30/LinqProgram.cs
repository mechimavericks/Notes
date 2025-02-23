using System;
using System.Linq;
using System.Collections.Generic;
class Employee{
    public string name;
    public int salary;
    public Employee(string name,int salary){
        this.name=name;
        this.salary=salary;
    }
}

class LinqProgram{
    public static void Main(){
        List<Employee> list = new List<Employee>(){
            new Employee("Santosh",50000),
            new Employee("Maonj",60000),
            new Employee("Arjun",25800),
            new Employee("Adi",368100),
            new Employee("Krishna",80000)
        };
        int sum=(from x in list select x.salary).Sum();
        Console.WriteLine("Sum of Salary : {0}",sum);
        var records=from x in list 
                    orderby x.salary descending
                    select x;
        foreach(var record in records){
            Console.WriteLine("Name : {0}\t Salary : {1}",record.name,record.salary);
        }

    }
}