using System;
class DataHolder{
    private int[] data= new int[10];
    public int this[int i]{
        set{data[i]=value;}
        get{return data[i];}
    }
}
class IndexersEx{
    static void Main(){
        DataHolder obj = new DataHolder();
        obj[0]=10;
        obj[1]=20;
        obj[2]=50;
        obj[3]=100;
        for(int i=0;i<10;i++)
            Console.WriteLine("Value at {0} is {1}",i,obj[i]);
    }
}