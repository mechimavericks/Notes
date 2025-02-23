/*Write a C# program to create a class Time Which represnt time. 
The Class Should Have three fields for hours,minutes and seconds. 
It should have constructor to initialize hours,minutes and seconds and method displayTime() 
to print current time. Overload following Operators: 
a) + (add two time objects on 24 hours clock)
b) < (Compare two time objects)
*/
using System;
class Time{
    private int hours,minutes,seconds;
    public Time(){}
    public Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    public void displayTime(){
        Console.WriteLine("Time : {0}:{1}:{2}",this.hours,this.minutes,this.seconds);
    }
    public static Time operator +(Time obj1, Time Obj2){
        Time temp = new Time();
        temp.hours=obj1.hours+Obj2.hours;
        temp.minutes=obj1.minutes+Obj2.minutes;
        temp.seconds=obj1.seconds+Obj2.seconds;
        return temp;
    }
    public static bool operator <(Time obj1,Time obj2){
        if(obj1.hours<obj2.hours){
            return true;
        }else if(obj1.hours==obj2.hours && obj1.minutes<obj2.minutes){
            return true;
        }else if(obj1.hours==obj2.hours && obj1.minutes==obj2.minutes && obj1.seconds<obj2.seconds){
            return true;
        }else {
            return false;
        }
    }
    public static bool operator >(Time obj1,Time obj2){
        return !(obj1<obj2);
    }
}
class TimeOperation{
    public static void Main(){
        Time a= new Time(10,15,30);
        Time b = new Time(20,14,30);
        a.displayTime();
        b.displayTime();
        Time c= new Time();
        c=a+b;
        c.displayTime();
        if(a<b){
            Console.WriteLine("Time B is Greater");
        }else{
            Console.WriteLine("Time A is Greater");
        }
    }

}