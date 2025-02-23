import java.util.Dictionary;
import java.util.Hashtable;
class DictionaryDemo{
    public static void main(String args[]){
        Dictionary data = new Hashtable();
        data.put(1,"Java");
        data.put(4,"PHP");
        data.put(5,"C++");
        System.out.println(data);
        System.out.println("Value at Key 4 = "+data.get(4));
        System.out.println("Remove the Value of key 5 = "+data.remove(5));
        System.out.println(data);
    }
}