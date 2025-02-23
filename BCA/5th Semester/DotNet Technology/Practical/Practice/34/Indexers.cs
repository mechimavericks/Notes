using System;
class Indexingvalue{
    private int[] num = new int[10];
    public int this[int i]{
        set{
            num[i]=value;
        }
        get{
            return num[i];
        }
    }
}
class Indexers{
    public static void Main(){
        Indexingvalue obj = new Indexingvalue();
        for(int i=0;i<10;i++){
            obj[i]=i+25;
        }
        for(int i=0;i<10;i++){
            Console.WriteLine($"{obj[i]}");
        }
    }
}
