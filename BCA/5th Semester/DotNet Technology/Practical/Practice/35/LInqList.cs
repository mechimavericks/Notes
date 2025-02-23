using System;
using System.Linq;
using System.Collections.Generic;
class Employee{
    public int salary;
    public string name;
    public Employee(string name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
class LInqList{
    static void Main(){
        List<Employee> lst=new List<Employee>(){
            new Employee("San",50000),
            new Employee("santosh",20000),
            new Employee("Adi",100000),
            new Employee("Kris",36500),
            new Employee("manoj",75000),
        };
        int sum=(from x in lst select x.salary).Sum();
        var res=from x in lst 
                orderby x.salary descending
                select x;
        Console.WriteLine("Sum of Salary : "+sum);
        foreach(var data in res){
            Console.WriteLine($"Name : {data.name}\tSalary : {data.salary}");
        }
    }
}