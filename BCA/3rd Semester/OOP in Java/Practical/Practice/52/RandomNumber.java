import java.util.Random;
class RandomNumber{
    public static void main(String args[]){
        Random r= new Random();
        for(int i=1;i<=10;i++)
            System.out.println(r.nextInt(50)); //use to generate random number from 0-50
    }
}