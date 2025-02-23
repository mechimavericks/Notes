using System;
using System.Collections.Generic;
using System.Linq;
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
class LINQData1{
    static void Main(){
        // Creating List and Adding Records
        List<Employee> list = new List<Employee>();
        list.Add(new Employee(100,"Santosh","BTM",25,25000.00));
        list.Add(new Employee(101,"Geeta","BRD",22,28000.00));
        list.Add(new Employee(102,"Hari","KVT",21,20000.00));
        list.Add(new Employee(103,"Krishna","KTM",28,29000.00));
        list.Add(new Employee(104,"Sita","BRT",22,30000.00));
        // Filtering the Data    
        var filtered=from x in list
                    where x.age==22
                    orderby x.name ascending
                    select x;
        // Displaying All the Records 
        Console.WriteLine("Eid\tName\tAddress\tAge\tSalary");
        foreach (var item in filtered){
            Console.WriteLine("{0}\t{1}\t{2}\t{3}\t{4}",item.eid,item.name,item.address,item.age,item.salary);
        }

    }
}