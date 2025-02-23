import java.io.*;
import java.util.Scanner;
class Data implements Serializable{
    int rno;
    String name;
    public Data(int n, String na){
        rno=n;
        name=na;
    }
}
class SerializationDemo{
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Roll No. and Name:");
            int r=sc.nextInt();
            String n=sc.next();
            Data d1= new Data(r,n);
            FileOutputStream out=new FileOutputStream("data.txt");
            ObjectOutputStream obj=new ObjectOutputStream(out);
            obj.writeObject(d1);
            obj.flush();
            obj.close();
            FileInputStream in=new FileInputStream("data.txt");
            ObjectInputStream objIn=new ObjectInputStream(in);
            Data d=(Data)objIn.readObject();
            System.out.println("Roll No: "+d.rno+"\nName: "+d.name);
            objIn.close();
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
}