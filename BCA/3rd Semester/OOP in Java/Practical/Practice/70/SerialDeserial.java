import java.io.*;
class Data implements Serializable{
    String name; int age;
    void setData(String n, int a){
        name=n;
        age=a;
    }
}
class Serialization{
    Serialization() throws IOException{
        FileOutputStream o = new FileOutputStream("data.txt");
        ObjectOutputStream obj = new ObjectOutputStream(o);
        Data d = new Data();
        d.setData("Santosh Bhandari",20);
        obj.writeObject(d);
        System.out.println("Data Write Successfully.");
    }
}
class Deserialization{
    Deserialization() throws IOException{
        FileInputStream o = new FileInputStream("data.txt");
        ObjectInputStream obj = new ObjectInputStream(o);
        Data d = null;
        try{
        d=(Data)obj.readObject();
        System.out.println("Name = "+d.name+"\nAge = "+d.age);
        System.out.println("Data Read Successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class SerialDeserial{
    public static void main(String args[])throws IOException{
        Serialization s = new Serialization();
        Deserialization d = new Deserialization();
    }
}