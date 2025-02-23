import java.util.LinkedList;
class LinkedListDemo{
    public static void main(String args[]){
        LinkedList<Integer> data = new LinkedList<Integer>();
        for(int i=1;i<=5;i++)
            data.add(i);
        System.out.println(data);
        System.out.println("Size of LinkedList = "+data.size());
        System.out.println("Remove data at Index 3 = "+data.remove(3));
        System.out.println(data);
    }
}