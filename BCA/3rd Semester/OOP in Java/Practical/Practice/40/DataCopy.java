//Here We have assumed that source.txt is our source file and dest.txt is our destination file. we are going to copy the data from source to destination using character stream.
import java.io.*;
class DataCopy{
    public static void main(String args[])throws IOException{
        FileReader r=null;
        FileWriter w=null;
        try{
            r=new FileReader("source.txt");
            w=new FileWriter("dest.txt");
            int temp;
            while((temp=r.read())!=-1)
                w.write(temp);
            System.out.println("Data Copied Successfully");
        }finally{
            if(r!=null)
                r.close();
            if(w!=null)
                w.close();
        }     
    }
}