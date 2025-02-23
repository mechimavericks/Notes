class NumberClassMethod{
    public static void main(String args[]){
        Double d = new Double(103.26455);
        byte b= d.byteValue();
        short s= d.shortValue();
        int i= d.intValue();
        long l= d.longValue();
        float f= d.floatValue();
        double d1= d.doubleValue();
        System.out.println("Value of d after converting it to byte = "+b);
        System.out.println("Value of d after converting it to short = "+s);
        System.out.println("Value of d after converting it to int = "+i);
        System.out.println("Value of d after converting it to long = "+l);
        System.out.println("Value of d after converting it to float = "+f);
        System.out.println("Value of d after converting it to double = "+d1);
    }
}