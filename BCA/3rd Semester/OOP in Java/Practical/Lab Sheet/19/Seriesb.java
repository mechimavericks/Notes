/* WAP to print following series.
b. 1, 4, 9, 16, ….. upto 20 terms.   */

public class Seriesb {
    public static void main(String args[]){
        int sum=0,count=1;
        for(int i=1;count<=20;i+=2){
            sum=sum+i;
            count++;
            System.out.print(sum+"\t");
        }
    }
}
