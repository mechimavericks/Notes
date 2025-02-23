//creating and writig in the files
import java.util.Scanner;
import java.io.*;
class FileWriterDemo{
    public static void main(String args[])throws IOException{
       FileWriter f=null;
        try{
            f=new FileWriter("data.txt");
            System.out.println("Enter a Data You want to Write: ");
            Scanner sc= new Scanner(System.in);
            String d=sc.nextLine();
            f.write(d);
            System.out.println("Data Write Successfully");
        }finally{
            if(f!=null)
                f.close();
        }
    }
}