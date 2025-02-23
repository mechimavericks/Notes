using System;
class TestDelegate{
    public delegate void Msg();
    public delegate int Add(int x, int y);
    int Sum(int x, int y){
        return x+y;
    }
    void Msg1(){
        Console.WriteLine("Message 1");
    }
    void Msg2(){
        Console.WriteLine("Message 2");
    }
    static void Main(){
        TestDelegate t = new TestDelegate();
        Msg obj = new Msg(t.Msg1);
        obj+=t.Msg2;
        obj();
        Add a = new Add(t.Sum);
        Console.WriteLine(a(10,20));

    }
}