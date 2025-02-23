import java.util.Hashtable;
class HashtableDemo{
    public static void main(String args[]){
        Hashtable<Integer,String> data = new Hashtable<Integer,String>();
        data.put(1,"C");
        data.put(3,"PHP");
        data.put(4,"JAVA");
        System.out.println(data);
        System.out.println("Value of Key 3 = "+data.get(3));
        data.remove(4);
        System.out.println(data);
        
    }
}