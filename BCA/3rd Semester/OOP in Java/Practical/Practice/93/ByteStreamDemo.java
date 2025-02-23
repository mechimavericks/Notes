import java.io.*;
class ByteStreamDemo{
    public static void main(String args[])throws IOException{
        FileOutputStream w=null;
        FileInputStream r=null;
        try{
            w= new FileOutputStream("dest.txt");
            r= new FileInputStream("source.txt");
            int temp;
            while((temp=r.read())!=-1)
                w.write(temp);
            System.out.println("Data Copied Successfully");
        }finally{
            if(w!=null) 
                w.close();
        }
    }
}