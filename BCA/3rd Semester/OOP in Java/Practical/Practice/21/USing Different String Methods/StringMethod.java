class StringMethod{
    public static void main(String args[]){
        String fname = new String("Santosh ");
        String lname="Bhandari";
        String num = "100";
        int n = 50;
        System.out.println("Concatination = "+fname.concat(lname));
        System.out.println("String to Integer = "+Integer.parseInt(num));
        System.out.println("String to Integer = "+Integer.valueOf(num));
        System.out.println("Integer to String = "+Integer.toString(n));
        System.out.println("Integer to String = "+String.valueOf(n));
        System.out.println("Integer to String = "+String.format("%d",n));


    }
}