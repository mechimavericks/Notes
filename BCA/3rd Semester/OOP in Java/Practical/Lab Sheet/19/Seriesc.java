/*  WAP to print following series.
c. 100, 98, 96, 94, …………. Upto 10 terms.  */
public class Seriesc {
    public static void main(String[] args){
        int count=1;
        for(int i=100;count<=10;i-=2){
            System.out.print(i+"\t");
            count++;
        }
    }
}
