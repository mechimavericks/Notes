using System;
class StudentData{
    private int[] id = new int[10];
    public int this[int i]{
        get{
            return this.id[i];
        }
        set{
            this.id[i]=value;
        }
    }
}
class Indexers{
    static void Main(){
        StudentData obj = new StudentData();
        for(int i =0;i<10;i++){
            obj[i]=i+20;
        }
        for(int i =0;i<10;i++){
            Console.WriteLine("Value of {0}: {1}",i,obj[i]);
        }
        
    }  
}