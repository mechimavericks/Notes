import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class InputArrayList{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<String> input=new ArrayList<String>();
        System.out.println("Enter How Many Number You Want to Enter: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Name of People:");
        for(int i=1;i<=n;i++){
            System.out.print("Enter "+i+" Data: ");
            String data=sc.next();
            input.add(data);
        }
        // input.forEach(System.out::println);
        for(String a:input){
            System.out.println(a);
        }
    }
}