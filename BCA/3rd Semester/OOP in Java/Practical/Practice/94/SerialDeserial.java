import java.io.*;
class Data implements Serializable{
    String name;
    int age;
    Data(String name, int age){
    this.name=name;
    this.age=age;
    }
}
class SerialDeserial{
    public static void main(String args[])throws IOException{
        FileOutputStream w=new FileOutputStream("data.txt");
        ObjectOutputStream objo=new ObjectOutputStream(w);
        Data d=new Data("Santosh Bhandari",21);
        objo.writeObject(d);
        System.out.println("Object Write Successfully.");
        FileInputStream r=new FileInputStream("data.txt");
        ObjectInputStream obji=new ObjectInputStream(r);
        Data rd=null;
        try{

        rd=(Data)obji.readObject();
        System.out.println("Name = "+rd.name+"\nAge = "+rd.age);
        System.out.println("Object Read Successfully");
        }catch(Exception e){}

    }
}