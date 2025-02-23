// Write a C# program to demonstrate Join using LINQ.
using System;
using System.Linq;
using System.Collections.Generic;
class Student{
    public int sid,cid;
    public string sname,address;
    public Student(int sid,string sname,string address,int cid){
        this.sid=sid;
        this.sname=sname;
        this.address=address;
        this.cid=cid;
    }
}
class Course{
    public int cid;
    public string cname;
    public Course(int cid,string cname){
        this.cid=cid;
        this.cname=cname;
    }
}
class JoinLINQ{
    static void Main(){
        List<Student> std=new List<Student>();
        std.Add(new Student(1,"Rahul","KTM",1));
        std.Add(new Student(2,"Raj","KVT",2));
        std.Add(new Student(3,"Ravi","BTM",1));
        std.Add(new Student(4,"Rishi","BRT",3));
        std.Add(new Student(5,"KRishna","BTM",2));
        List<Course> crs=new List<Course>();
        crs.Add(new Course(1,"C#"));
        crs.Add(new Course(2,"Java"));
        crs.Add(new Course(3,"Python"));
        var res = from x in std
                    join y in crs
                    on x.cid equals y.cid
                    where y.cname=="C#"
                    select new{x.sname,x.address,y.cname};
        Console.WriteLine("Name\tAddress\tCourse");
        foreach (var data in res)
            Console.WriteLine("{0}\t{1}\t{2}",data.sname,data.address,data.cname);
        
    }
}