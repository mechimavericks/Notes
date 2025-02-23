import java.util.Scanner; // importing java scannerray
public class InputName{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in); //defining the scanner name.. Here n is an scanner name.
        String name;
        System.out.println("Enter Your Name:");
        name=n.nextLine(); //taking user input using n.
        System.out.println("Your Name is "+name);
        
    }
}