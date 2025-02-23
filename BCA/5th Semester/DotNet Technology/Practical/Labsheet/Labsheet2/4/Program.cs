// Write a program to define a class Circle with its data members pi and r and members functions getdata() for initializing data members and calculate() for finding area of circle. Return result from calculate() and display result in main() function. Use pi as constant.

using System;
class Circle{
    private double pi = 3.14,r;
    public void getdata(double r){
        this.r = r;
    }
    public double calculate(){
        return pi*r*r;
    }
}
class Program{
    static void Main(){
        Circle c = new Circle();
        c.getdata(10);
        Console.WriteLine($"Area of Circle : {c.calculate()}");
    }
}