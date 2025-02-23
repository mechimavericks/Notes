import java.util.Vector;
class VectorDemo{
    public static void main(String args[]){
        Vector list = new Vector();
        list.add(10);
        list.add(50);
        list.add(0,15);
        list.addElement(35);
        list.insertElementAt(17,3);
        System.out.println(list);
    }
}