class TernaryOperator{
    public static void main(String args[]){
        int a=40,b=30,c=20;
        int r=(a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println(r);
    }
}