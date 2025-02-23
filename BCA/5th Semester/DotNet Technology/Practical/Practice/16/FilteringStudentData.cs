// Select Records of Students whose age is Maximum among all the Students
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
                where x.age==(
                    from y in list
                    select y.age
                ).Max()
                orderby x.name
                select x;
        Console.WriteLine("Sid\tName\tAddress\tAge");
        foreach(var data in res){
            Console.WriteLine("{0}\t{1}\t{2}\t{3}",data.sid,data.name,data.address,data.age);
        }

    }
}
