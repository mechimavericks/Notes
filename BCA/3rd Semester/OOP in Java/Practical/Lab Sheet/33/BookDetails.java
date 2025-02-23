// Write a program which has class Book with data members book_name, ISBN, author & price and appropriate function members to read and display data members.
import java.util.Scanner;
class Book{
    private String book_name,author;
    private double ISBN;
    private float price;
    void Read(String n, double i, String a, float p){
        book_name = n;
        ISBN = i;
        author = a;
        price = p;
    }
    void Display(){
        System.out.println("Book Name = "+book_name+"\nISBN = "+ISBN+"\nAuthor = "+author+"\nPrice = "+price);
    }
}
class BookDetails{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        System.out.println("Enter the Name, ISBN, Author and Price of the Book: ");
        String n=sc.nextLine();
        double i=sc.nextDouble();
        String a=sc.next();
        float p=sc.nextFloat();
        b1.Read(n,i,a,p);
        b1.Display();
    }
}