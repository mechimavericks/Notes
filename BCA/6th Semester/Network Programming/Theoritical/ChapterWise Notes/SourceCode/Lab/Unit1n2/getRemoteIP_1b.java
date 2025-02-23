package Lab.Unit1n2;//Experiment no 1b.
//Looking up internet address of Remote host
import java.lang.*;
import java.net.*;

public class getRemoteIP_1b {
    public static void main(String args[]) {
        try {
            InetAddress IPO = InetAddress.getByName("www.bizzinus.com"); //args[0]
            System.out.println("IP of this system = " + IPO);
        } catch (Exception e) {
            System.out.println("Exception caught = " + e.getMessage());
        }
    }
}
