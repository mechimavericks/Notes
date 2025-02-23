import java.util.Random;
class RandGenerator{
    public static void main(String args[]){
        Random n= new Random();
        int num = n.nextInt(100);
        System.out.println(num);
    }
}