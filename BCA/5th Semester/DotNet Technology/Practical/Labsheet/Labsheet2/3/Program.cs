// Write a program which has class Book with data members book_name, ISBN, author & price and appropriate function members to read and display data members.
using System;
class Book{
    private string book_name,ISBN,author;
    private double price;
    public void ReadData(string book_name,string ISBN,string author,double price){
        this.book_name = book_name;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
    }
    public void DisplayData(){
        Console.WriteLine($"Book Name : {book_name}\nISBN : {ISBN}\nAuthor : {author}\nPrice : {price}");
    }
}
class Program{
    static void Main(){
        Book b = new Book();
        b.ReadData("C# Programming","123456789","Linus Torvals",1000);
        b.DisplayData();
    }
}