import com.sun.jdi.IntegerType;
import com.sun.jdi.IntegerValue;
import com.sun.jdi.connect.Connector;

import java.sql.SQLOutput;

/*  WAP to typecast the following:
a) Integer to String
b) String to Integer
c) Integer to Double
d) Double to Integer
e) String to Double
f) Double to String               */
public class TypeCasting{
    public static void main(String args[]){
//        Integer to String
        int num = 50;
        String ch = String.valueOf(num);
        // There are three method we can use to convert integer to string.
        // String ch = String.format("%d",num);
        // String ch = Integer.toString(num);
        System.out.println("Integer to String = "+ch);

        // String to Integer
        String k = "124583";
//        int m = Integer.parseInt(k);
        int m = Integer.valueOf(k);
        System.out.println("String to Integer = "+m);

        // Integer to Double
        int a=100;
        double d = (double) a;
        System.out.println("Integer to Double = "+d);

        // Double to Integer
        double n=103.584;
        int c = (int)n;
        System.out.println("Double to Integer = "+c);

        //String to Double
        String str = "1250.15847";
        double dou=Double.parseDouble(str);
        System.out.println("String to Double = "+dou);

        // Double to String
        double g = 50.2896;
        // There are three method we can use to convert integer to string.
            String h = String.valueOf(g);
        // String h = Double.toString(g);
        System.out.println("Double to String = "+h);

    }
}