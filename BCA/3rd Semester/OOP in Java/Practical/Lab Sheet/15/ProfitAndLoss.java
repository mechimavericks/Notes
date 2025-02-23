// WAP to input CP and SP and check profit or loss. Also find profit or loss amount.
import java.util.Scanner;
public class ProfitAndLoss{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Selling Price and Cost Price:");
        int sp=sc.nextInt(),cp=sc.nextInt();
        if(sp>cp)
            System.out.println("Profit\nProfit Amount = "+(sp-cp));
        else
            System.out.println("Loss\nLoss Amount = "+(cp-sp));
    }
}