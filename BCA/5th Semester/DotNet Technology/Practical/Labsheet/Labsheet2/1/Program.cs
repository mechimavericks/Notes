// Create a simple class named Person that contains basic information like name, age, gender, etc. Your class should also contain functions/methods for storing and displaying data.
using System;
class Person{
    public string name,gender;
    public int age;
    public void setData(string name,string gender,int age){
        this.name = name;
        this.age = age;
        this.gender=gender;
    }
    public void displayData(){
        Console.WriteLine($"Name: {this.name}\nGender : {this.gender}\nAge : {this.age}");
    }    
}
class Program{
    static void Main(){
        Person p = new Person();
        p.setData("Santosh Bhandari","Male",23);
        p.displayData();
    }
}