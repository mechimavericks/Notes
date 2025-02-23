/* Write a C# program to store id, name, age, address and salary of 5 employees in a list.
Now write LINQ query for the following:
• Select name and age of employees whose salary is greater than 20000 and age is less than 35.
• Select all records of employees whose name starts with letter ‘R’ and age greater than 25 in descending order based on age.
• Select all records of employee whose salary is maximum.
• Select id and name of employee whose salary is between 20000 and 30000.
• Select id and name of employees whose address is Btm and salary is greater than average salary of employees.
• Select records of employee group by address in ascending order based on age. */
using System;
using System.Linq;
using System.Collections.Generic;
class Employee{
    public int id,age;
    public double salary;
    public string name,address;
    public Employee(int id,string name,int age,string address,double salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.salary=salary;
    }
}
class LINQQuery{
    static void Main(){
        List<Employee> list = new List<Employee>();
        list.Add(new Employee(1,"Rohit",25,"KTM",20000));
        list.Add(new Employee(2,"Raj",30,"KVT",50000));
        list.Add(new Employee(3,"Ravi",35,"BTM",40000));
        list.Add(new Employee(4,"Rahul",40,"BRT",50000));
        list.Add(new Employee(5,"Krishna",45,"BTM",30000));

        // //Select name and age of employees whose salary is greater than 20000 and age is less than 35.
        var res1 = from x in list
                    where x.salary>20000 && x.age<35
                    select new{x.name,x.age};
        Console.WriteLine("Name And Age of Employees whose salary>20000 and age < 35");
        foreach (var item in res1)
            Console.WriteLine("{0}\t{1}",item.name,item.age);

        // // Select all records of employees whose name starts with letter ‘R’ and age greater than 25 in descending order based on age.
        var res2 = from x in list
                    where x.name.StartsWith("R") && x.age>25
                    orderby x.age descending
                    select x;
        Console.WriteLine("Records of Employee whose name starts with letter ‘R’ and age>25 in descending order based on age:");
        foreach (var item in res2)
            Console.WriteLine("{0}\t{1}\t{2}\t{3}\t{4}",item.id,item.name,item.age,item.address,item.salary);
        
        // Select all records of employee whose salary is maximum.
        var res3 = from x in list
                    where x.salary==(
                        from y in list
                        select y.salary
                    ).Max()
                    select x;
        Console.WriteLine("Records of Employee whose salary is maximum:");
        foreach (var item in res3)
            Console.WriteLine("{0}\t{1}\t{2}\t{3}\t{4}",item.id,item.name,item.age,item.address,item.salary);

        // Select id and name of employee whose salary is between 20000 and 30000.
        var res4 = from x in list
                    where x.salary>=20000 && x.salary<=30000
                    select new{x.id,x.name};
        Console.WriteLine("Id and Name of Employee whose salary is between 20000 and 30000:");
        foreach (var item in res4)
            Console.WriteLine("{0}\t{1}",item.id,item.name);

        // Select id and name of employees whose address is Btm and salary is greater than average salary of employees.
        var res5 = from x in list
                    where x.address=="BTM" && x.salary>(
                        from y in list
                        select y.salary
                    ).Average()
                    select new{x.id,x.name};
        Console.WriteLine("Id and Name of Employees whose address = Btm and salary > average");
        foreach (var item in res5)
            Console.WriteLine("{0}\t{1}",item.id,item.name);

        // Select records of employee group by address in ascending order based on age.
        var res6 = from x in list
                    orderby x.age ascending
                    group x by x.address;
        Console.WriteLine("Records of Employee group by address in ascending order based on age:");
        foreach (var items in res6){
            Console.WriteLine("Address: {0}",items.Key);
            foreach (var item in items)
                Console.WriteLine("{0}\t{1}\t{2}\t{3}\t{4}",item.id,item.name,item.age,item.address,item.salary);
        }
    }
}