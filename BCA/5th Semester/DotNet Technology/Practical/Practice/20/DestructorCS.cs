using System;
public class Display{
    public string name,address,faculty;
    public Display(string name,string address,string faculty){
        this.name=name;
        this.address=address;
        this.faculty=faculty;
    }
    public void DisplayInfo(){
        Console.WriteLine("Name : {0}\nAddress : {1}\nFaculty : {2}",name,address,faculty);
    }
    ~Display(){
        Console.WriteLine("Object Deleted Successfully");
    }
}
class ConstructorCS{
    public static void Main(){
        Display obj = new Display("Santosh Bhandari","Kanakai -07","BCA");
        obj.DisplayInfo();
    }
}