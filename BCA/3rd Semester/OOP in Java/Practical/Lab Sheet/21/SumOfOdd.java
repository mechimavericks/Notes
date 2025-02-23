// WAP to find sum of odd numbers from 1 to 100.
public class SumOfOdd{
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++)
            if(i%2==1)
                sum+=i;
        System.out.println("sum of Odd Numbers From 1 to 100 is "+sum);   
    }
}