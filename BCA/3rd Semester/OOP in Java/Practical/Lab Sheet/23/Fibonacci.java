// WAP to print following Fibonacci series. 1, 1, 2, 3, 5, 8, …….. upto 15 terms.
public class Fibonacci {
    public static void main(String args[]){
        int a=0,b=1,c,i;
        System.out.print(b+"\t");
        for(i=2;i<=15;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+"\t");
        }
    }
}
