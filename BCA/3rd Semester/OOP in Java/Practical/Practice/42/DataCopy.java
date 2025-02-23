//Program to copy the data from source and past it into destination file;
import java.io.*;
class DataCopy{
    public static void main(String args[])throws IOException{
        FileOutputStream write=null;
        FileInputStream read=null;
        try{
            read = new FileInputStream("source.txt");
            write = new FileOutputStream("dest.txt");
            int temp;
            while((temp=read.read())!=-1)
                write.write(temp);
            System.out.println("Copied Data Successfully");
        }finally{
            if(read!=null)
                read.close();
            if(write!=null)
                write.close();
        }
    }
}