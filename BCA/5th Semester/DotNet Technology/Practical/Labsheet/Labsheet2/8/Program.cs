// Write programs to show all usage of this keyword.(You must write separate programs for each usage)

using System;
class Person{
    public string Name;
    public Person(string Name){
        this.Name = Name;
    }
}
class Program{
    static void Main(){
        Person p = new Person("John");
        Console.WriteLine("Name of the Person : " + p.Name);
    }
}