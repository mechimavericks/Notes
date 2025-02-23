//Performing Serializationa and Deserialization Operation
import java.io.*;
class StudentData implements Serializable{
    String name;
    int sn,age;
    void setData(int sn, String name, int age){
        this.sn=sn;
        this.name=name;
        this.age=age;
    }
}
class Serialization{
    Serialization() throws IOException{
    FileOutputStream write=new FileOutputStream("Santosh.txt");
        ObjectOutputStream obj=new ObjectOutputStream(write);
        StudentData s=new StudentData();
        s.setData(1,"Santosh Bhandari",20);
        obj.writeObject(s);
        System.out.println("Object Write Successfully.");
    }
}
class Deserialization{
    Deserialization()throws IOException{
        FileInputStream read = new FileInputStream("Santosh.txt");
        ObjectInputStream obj = new ObjectInputStream(read);;
        StudentData s=null;
        try{
            s=(StudentData)obj.readObject();
            System.out.println(s.sn);
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println("Object Read Successfully.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class SerializationDeserializationDemo{
    public static void main(String args[])throws IOException{
        Serialization s1=new Serialization();
        Deserialization de1=new Deserialization();
    }
}
