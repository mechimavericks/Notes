import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
class SetInterface{
    public static void main(String args[]){
        Set<Integer> data = new HashSet<Integer>();
        data.add(5);
        data.add(4);
        data.add(7);
        data.add(2);
        data.add(5);
        data.add(58);
        data.add(100);
        data.add(55);
        System.out.println("Data Without Duplicates\n"+data);
        Set treedata= new TreeSet(data);
        System.out.println("Data In Sorted Order\n"+treedata);
    }
}