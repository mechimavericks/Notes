// Write a java Program to check the number is Prime or not.
import java.util.*;
class CheckPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  Number: ");
        int num=sc.nextInt();
        int i,count=0;
        for(i=2;i<num;i++){
            if(num%i==0)
                count++;
                break;
        }
        if(count==0)
            System.out.println(num+" is a Prime Number.");
        else
            System.out.println(num+" is Not a Prime Number.");
                    
    }
}