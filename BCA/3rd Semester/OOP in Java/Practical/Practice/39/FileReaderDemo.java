// Reading from the file 
import java.io.*;
class FileReaderDemo{
    public static void main(String args[])throws IOException{
        FileReader r=null;
        try{
            r=new FileReader("data.txt");
            int temp;
            while((temp=r.read())!=-1)
                System.out.print((char)temp);
        }finally{
            r.close();
        }
    }
}