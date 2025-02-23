// WAP to find sum of numbers from 5 to 100.
public class Sum5to100 {
    public static void main(String args[]){
        int sum=0;
        int i=5;
        while(i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum from 5 to 100 = "+sum);
    }
}
