// Write a program to show the use of break, continue and return.
public class BreakContinueReturn {
    public  static void main(String args[]){
        System.out.println("Using Break ");
        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==5)
                break;
        }
        System.out.println("Using Continue ");
        for(int i=0;i<=10;i++){
            if(i==6)
            continue;
            System.out.println(i);
        }
        int a=5,b=6;
        System.out.println("Sum of "+a+" and "+b+" is "+(Sum(a,b)));
    }
   static int Sum(int x, int y){
        return  x+y;
    }
}
