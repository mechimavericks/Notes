import java.io.*;
class FileRead{
    public static void main(String args[])throws IOException{
        FileReader r=new FileReader("Data.txt");
        int t;
        while((t=r.read())!=-1)
            System.out.print((char)t);
        System.out.println("\nData Read Successfully");
        r.close();
    }
}