class First{
    private static int rno=56;
    private static String Name = "Krishna";
    class Second{
         static void Display(){
            System.out.println("Roll No. = "+rno+"\nName = "+Name);
        }
    }
}
class NestedClass{
    public static void main(String[] args) {
        First.Second.Display();
    }
}