import java.util.TreeSet;
class TreeSetDemo{
    public static void main(String args[]){
        TreeSet<Integer> data = new TreeSet<Integer>();
        for(int i=1;i<=5;i++)
            data.add(i);
        System.out.println(data);
        System.out.println("Size of TreeSet = "+data.size());
        System.out.println("Remove data at Index 3 = "+data.remove(3));
        System.out.println(data);
    }
}