using System;
class A{
    private int data;
    public int setdata{
        set{
            this.data=value;
        }
        get{
            return this.data;
        }
    }
}
class PropertiesEx{
    static void Main(){
        A obj = new A();
        obj.setdata=20;
        Console.WriteLine("Value : {0}",obj.setdata);
    }
}