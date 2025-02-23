import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class IntArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> data = new ArrayList<Integer>();
        System.out.println("Enter 10 Integer Numbers:");
        int a;
        for(int i=0;i<10;i++){
            a=sc.nextInt();
            data.add(a);
        }
        System.out.println("Entered Numbers are:");
        // data.forEach(System.out::println);
        for(int b:data)
            System.out.println(b);
    }
}
