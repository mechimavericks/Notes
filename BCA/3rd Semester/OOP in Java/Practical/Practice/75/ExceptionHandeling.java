class ExceptionHandeling{
    public static void main(String args[]){
        int a=4,b=0;
        // if(b==0)
        //     throw new ArithmeticException("Divided By Zero");
        try{
            System.out.println("Division = "+(a/b));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}