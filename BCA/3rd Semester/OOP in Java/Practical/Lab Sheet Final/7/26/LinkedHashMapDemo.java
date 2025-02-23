import java.util.LinkedHashMap;
import java.util.Map;
class LinkedHashMapDemo{
    public static void main(String args[]){
        Map<Integer, String> map = new LinkedHashMap<Integer,String>();
        map.put(1,"C");
        map.put(2,"Java");
        map.put(3,"PHP");
        map.put(4,"C++");
        System.out.println(map);
        System.out.println(map.get(3));
    }
}