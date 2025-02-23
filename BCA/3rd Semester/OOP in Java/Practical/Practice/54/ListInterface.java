import java.util.List;
import java.util.ArrayList;
class ListInterface{
    public static void main(String args[]){
        List<Integer> data = new ArrayList<Integer>();
        for(int i=1;i<=10;i++)
            data.add(i);
        System.out.println(data);
        System.out.println("Value at Index 4 = "+data.get(4));
        System.out.println("Remove data at Index 6 = "+data.remove(6));
        System.out.println("Size = "+data.size());
        System.out.println(data);

    }
}