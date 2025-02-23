using System;
namespace Greet{
    public class Greeting{
        string name;
        public void Name(string name){
            this.name=name;
        }
        public void Greet(){
            Console.WriteLine("Welcome {0} in the WOrld of C#",this.name);
        }
    }
}