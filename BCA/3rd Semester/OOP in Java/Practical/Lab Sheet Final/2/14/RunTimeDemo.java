// Demonstrate Simple Shape using Java. Here we have Threee definitions of the same method draw( ) which different draw method, would be called is determined by their respected Shape at the Run Time.
class Shape{
    void Draw(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    void Draw(){
        System.out.println("Circle");
    }
}
class Triangle extends Shape{
    void Draw(){
        System.out.println("Triangle");
    }
}
class Rectangle extends Shape{
    void Draw(){
        System.out.println("Rectangle");
    }
}
class RunTimeDemo{
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape r=new Rectangle();
        c.Draw();
        t.Draw();
        r.Draw();
    }
}