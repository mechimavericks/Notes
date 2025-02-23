//Java Program to check whether a char is vowel or Consonant using Switch Case
import java.util.*;
public class VowelConsonant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(ch+" is Vowel.");
                break;
            default:
                System.out.println(ch+" is Consonant.");
        }
    }

}