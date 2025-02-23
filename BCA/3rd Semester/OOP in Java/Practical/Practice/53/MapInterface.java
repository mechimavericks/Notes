import java.util.Map;
import java.util.HashMap;
class MapInterface{
    public static void main(String args[]){
        Map<Integer,String> data = new HashMap<Integer, String>();
        data.put(1,"Java");
        data.put(2,"HTML");
        data.put(4,"PHP");
        System.out.println(data);
        System.out.println("Value at Key 2 = "+data.get(2));
        System.out.println("Remove Value at Key 4 = "+data.remove(4));
        System.out.println(data);        
    }
}