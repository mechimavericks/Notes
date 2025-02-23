using System;
public class DisplayInfo{
    public void Disp(){
        Console.WriteLine("Name : Santosh Bhandari\nAddress : Kanakai-03\nSemester : Fifth");
    }
}
class ClassObject{
    public static void Main(){
        DisplayInfo obj = new DisplayInfo();
        obj.Disp();
    }
}