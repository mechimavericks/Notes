using System;
using System.Collections.Generic;
using System.Linq;
class Student{
    public int sid,age;
    public string name,address;
    public Student(int sid, string name, string address, int age){
        this.sid=sid;
        this.name=name;
        this.address=address;
        this.age=age;
    }
}
class LINQData3{
    static void Main(){
        List<Student> list = new List<Student>();
        list.Add(new Student(100,"Santosh","KTM",25));
        list.Add(new Student(101,"Ayush","BTM",22));
        list.Add(new Student(102,"Anish","BDP",23));
        list.Add(new Student(103,"Kushal","BTM",25));
        list.Add(new Student(104,"Manoj","KTM",28));
        list.Add(new Student(105,"Kiran","KVT",22));
        var res=from x in list
                where x.age>22
                orderby x.name
                select new {x.sid,x.name};
        Console.WriteLine("Sid\tName");
        foreach(var data in res){
            Console.WriteLine("{0}\t{1}",data.sid,data.name);
        }

    }
}