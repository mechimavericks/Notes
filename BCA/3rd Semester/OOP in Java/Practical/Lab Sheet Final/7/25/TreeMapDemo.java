import java.util.TreeMap;
import java.util.Map;
class TreeMapDemo{
    public static void main(String args[]){
        Map<Integer, String> map = new TreeMap<Integer,String>();
        map.put(1,"C");
        map.put(2,"Java");
        map.put(3,"PHP");
        map.put(4,"C++");
        System.out.println(map);
        System.out.println(map.get(3));
    }
}