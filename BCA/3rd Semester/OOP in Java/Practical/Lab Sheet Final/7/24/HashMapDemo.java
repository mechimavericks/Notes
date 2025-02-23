import java.util.HashMap;
class HashMapDemo{
    public static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(1,"C Programming");
        map.put(2,"Java Programming");
        map.put(3,"PHP Programming");
        map.put(4,"C++ Programming");
        System.out.println(map);
        System.out.println(map.get(3));
    }
}