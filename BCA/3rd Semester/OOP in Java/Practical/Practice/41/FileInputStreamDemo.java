//ByteStream to read the data of a file
import  java.util.Scanner;
import java.io.*;
class FileInputStreamDemo{
    public static void main(String args[])throws IOException{
       FileInputStream read=null;
        try{
            read=new FileInputStream("santosh.txt");
            int temp;
            while((temp=read.read())!=-1)
                System.out.print((char)temp);
        }finally{
            if(read!=null)
                read.close();
        }
    }
}