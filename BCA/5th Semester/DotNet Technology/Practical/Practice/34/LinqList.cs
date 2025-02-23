using System;
using System.Collections.Generic;
using System.Linq;
class Student{
    public string name,cid,address;
    public Student(string cid, string name,string address){
        this.cid=cid;
        this.name=name;
        this.address=address;
    }
}
class Course{
    public string cid,cname;
    public Course(string cid, string cname){
        this.cid=cid;
        this.cname=cname;
    }
}
class LinqList{
    static void Main(){
        // Student std = new Student();
        // Course crs=new Course();
        List<Course> crs = new List<Course>(){
            new Course("C101","Java"),
            new Course("C102","C"),
            new Course("C103","C#"),
            new Course("C104","Python"),
        };
        List<Student> std = new List<Student>(){
            new Student("C101","Santosh","BTM"),
            new Student("C102","Krishna","BRT"),
            new Student("C101","Adi","BDP"),
            new Student("C104","Manoj","BTM"),
        };
        var res= from x in std 
                join y in crs   
                on x.cid equals y.cid
                where x.cid=="C101"
                orderby x.name ascending
                select new {x.name,x.address,y.cname};
        foreach(var data in res){
            Console.WriteLine("Name: {0} \t Address : {1} \t Course : {2}",data.name,data.address,data.cname);
        }  
    }
}