// WAP to print prime numbers from 1 to 100.
public class Prime1to100 {
    public static void main(String args[]){
        System.out.println("Prime Number from 1 to 100:");
        for(int i=1;i<=100;i++){
            int count=0;
            for(int j=2;j<i;j++)
                if(i%j==0){
                    count++;
                    break;
                }
            if(count==0)
                System.out.println(i);
        }
    }
    
}
