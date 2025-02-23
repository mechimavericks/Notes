import java.util.ArrayList;
import java.util.Collections;
class ComparatorDemo{
    public static void main(String args[]){
        ArrayList list = new ArrayList();
        list.add("Ram");
        list.add("Hari");
        list.add("Ayush");
        list.add("Krishna");
        System.out.println("Before Sorting\n"+list); 
        Collections.sort(list);
        System.out.println("After Sorting\n"+list); 
    }
}
