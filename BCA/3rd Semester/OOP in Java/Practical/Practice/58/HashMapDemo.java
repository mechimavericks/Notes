import java.util.HashMap;
class HashMapDemo{
    public static void main(String args[]){
        HashMap<Integer,String> data = new HashMap<Integer,String>();
        data.put(1,"Maths");
        data.put(3,"JAVA");
        data.put(5,"DSA");
        data.put(4,"SAD");
        System.out.println(data);
        System.out.println("Size = "+data.size());
        System.out.println("Value of key 5 = "+data.get(5));
        System.out.println("Remove data of Key 3 = "+data.remove(3));
        System.out.println(data);
    }
}