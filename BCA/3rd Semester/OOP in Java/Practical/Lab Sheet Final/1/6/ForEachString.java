// for-each loop (a.) Integer (b.) String
import java.util.ArrayList;
import java.util.List;
public class ForEachString{
    public static void main(String args[]){
            List<String> name=new ArrayList <String>();
            name.add("Ram");
            name.add("Hari");
            name.add("Geeta");
            name.add("Sita");
            for(String n:name)
                System.out.println(n);
        }
}
