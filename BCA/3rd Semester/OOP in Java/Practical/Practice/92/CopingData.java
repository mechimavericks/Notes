import java.io.*;
class CopingData{
    public static void main(String args[])throws IOException{
        FileOutputStream w=null;
        FileInputStream read=null;
        try{
            read = new FileInputStream("data.txt");
            w= new FileOutputStream("dest.txt");
            int temp;
            while((temp=read.read())!=-1)
                w.write(temp);
            System.out.println("Copied Data Successfully");
        }finally{
            if(read!=null)
                read.close();
            if(w!=null)
                w.close();
        }
    }
}