//Here is Method overriding we cannot override the value of member. 
class Book{
    String name="Book";
    void Display(){
        System.out.println("Collection of Book.");
    }
}
class Java extends Book{
    String name="Java";
    void Display(){
        System.out.println("Java Book.");
    }
}
class WebTechnology extends Book{
    String name="Web Technology";
    void Display(){
        System.out.println("Web Technology Book.");
    }
}
class RunTime{
    public static void main(String[] args) {
        Book j=new Java();
        Book w=new WebTechnology();
        j.Display();
        w.Display();
        System.out.println(j.name); // result will be Book
        System.out.println(w.name); // Result will be book; We cannot override member value;
    }
}