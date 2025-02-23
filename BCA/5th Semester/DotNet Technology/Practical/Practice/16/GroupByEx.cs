// Select REcords of Employee by Grouping on the Basis of Address
using System;
using System.Linq;
using System.Collections.Generic;
class Employee{
    public int eid,age;
    public string name,address;
    public double salary;
    public Employee(int eid, string name, string address, int age, double salary){
        this.eid=eid;
        this.name=name;
        this.address=address;
        this.age=age;
        this.salary=salary;
    }
}
class GroupByEx{
    static void Main(){
         // Creating List and Adding Records
        List<Employee> list = new List<Employee>();
        list.Add(new Employee(100,"Santosh","BTM",25,25000.00));
        list.Add(new Employee(101,"Geeta","BRD",22,28000.00));
        list.Add(new Employee(102,"Hari","KVT",21,20000.00));
        list.Add(new Employee(103,"Krishna","KTM",28,29000.00));
        list.Add(new Employee(104,"Sita","BRT",22,30000.00));
        // Select REcords of Employee by Grouping on the Basis of Address
        var res=from x in list
                where x.age>21
                group x by x.address;
        // Displaying All the Records 
        Console.WriteLine("Eid\tName\tAddress\tAge\tSalary");
        foreach(var items in res){
            Console.WriteLine("{0}",items.Key);
            foreach (var item in items){
                Console.WriteLine("{0}\t{1}\t{2}\t{3}\t{4}",item.eid,item.name,item.address,item.age,item.salary);
            }
        }
    }
}