using System;
class Custom:Exception{
    public Custom(string msg):base(msg){}
}
class Program{
    static void Main(){
        int age=15;
        try{  
            if (age<18){
                throw new Custom("Age is Less than 18.");
            }else{
                Console.WriteLine("Age is Greater or Equals to 18.");
            }
        }catch(Custom ex){
            Console.WriteLine(ex);
        }
    }
}