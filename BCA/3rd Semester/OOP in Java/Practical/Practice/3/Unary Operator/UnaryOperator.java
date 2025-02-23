class UnaryOperator{
    public static void main(String[] args){
        int a=10;
        System.out.println("Post Increment = "+(a++));//a=10 and value of a=11;
        System.out.println("Pre Increment = "+(++a));// a=12
        System.out.println("Post Decrement = "+(a--)); // a=12 and value of a= 11;
        System.out.println("Pre decrement = "+(--a)); //a=10;
    }
}