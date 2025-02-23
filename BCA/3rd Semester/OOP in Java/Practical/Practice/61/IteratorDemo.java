import java.util.ArrayList;
import java.util.Iterator;
class IteratorDemo{
    public static void main(String args[]){
        ArrayList list = new ArrayList();
        for(int i=1;i<=10;i++)
            list.add(i);
        Iterator i = list.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}
