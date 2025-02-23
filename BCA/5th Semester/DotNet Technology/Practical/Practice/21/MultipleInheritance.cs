using System;
interface A{
    //doesn't contain data members
    //method only contain signature
    int CalculateArea();
    int CalculatePerimeter();
}
class B{
    public int l, b;
    public void ReadData(int l, int b)    {
        this.l = l;
        this.b = b;
    }
}
class C : B,A
{
    public int CalculateArea(){
        ReadData(10, 5);
        int area = l * b;
        return area;
    }
    public int CalculatePerimeter(){
        ReadData(15, 10);
        int peri = 2 * (l + b);
        return peri;
    }
}
//driver class
class MultipleInheritance
{
    static void Main(string[] args)
    {
        C obj = new C();
        //int area=obj.CalculateArea();
        //int peri=obj.CalculatePerimeter();
        Console.WriteLine("Area of Rectangle=" + obj.CalculateArea());
        Console.WriteLine("Perimeter of Rectangle=" +
        obj.CalculatePerimeter());
        // Console.ReadKey();
    }
}