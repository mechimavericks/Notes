import java.io.*;
import java.util.*;
class FileWrite{
    public static void main(String args[])throws IOException{
        FileWriter f=new FileWriter("Data.txt");
        System.out.println("Enter a Text: ");
        Scanner sc= new Scanner(System.in);
        String data = sc.nextLine();
        f.write(data);
        System.out.println("Data Write Successfully");
            f.close();
    }
}