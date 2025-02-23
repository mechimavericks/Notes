import java.util.Arrays;
class StringMethod{
    public static void main(String args[]){
        String name = "Santosh";
        System.out.println("Character at Index 3 = "+name.charAt(3));
        char n[]= new char[5];
        name.getChars(2,5,n,0);
        System.out.println(n);
        System.out.println(Arrays.toString(name.getBytes()));

    }
}