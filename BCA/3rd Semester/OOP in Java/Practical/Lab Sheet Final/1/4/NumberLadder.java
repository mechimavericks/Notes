// Write a java Program to generate a Ladder of number
class NumberLadder{
    public static void main(String[] args){
        int n=5,i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++)
                System.out.print(j);
            for(k=j;k>0;k--)
                System.out.print(k);
            System.out.print("\n");
        }
    }
}