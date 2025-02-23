class FinallyDemo{
    static int Sum(){
        try{
            System.out.println("Running Try");
            return 10+20;
                        
        }
        finally{
            System.out.println("Running Finally");
        }
    }
    public static void main(String args[]){
        System.out.println("Sum of 10 and 20 is "+Sum());
    }
}