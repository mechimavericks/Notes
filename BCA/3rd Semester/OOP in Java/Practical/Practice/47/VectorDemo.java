import java.util.Vector;
class VectorDemo{
    public static void main(String args[]){
        Vector<Integer> data = new Vector<Integer>();
        for(int i=0;i<=10;i++)
            data.add(i);
        System.out.println(data);
        System.out.println("Item at Index 3 = "+data.get(3));
        data.remove(5);
        System.out.println("After Removing \n"+data);
        System.out.println("Size of Vector = "+data.size());
        data.clear();
        System.out.println(data);
    }
}