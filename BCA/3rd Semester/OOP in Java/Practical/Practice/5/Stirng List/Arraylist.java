import java.util.ArrayList;
import java.util.List;
public class Arraylist{
	public static void main(String args[]){
		List<String> santosh = new ArrayList <String>();
		santosh.add("Ram");
		santosh.add("hari");
		santosh.add("Krishna");
		santosh.add("Shyam");
		santosh.add("Geeta");
		santosh.forEach(System.out::println);
	//	for(String ray : santosh){
		//	System.out.println(ray);
//		}
	}
}