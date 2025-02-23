package Lab.Unit1n2;//Experiment no 1a.
//Looking up internet address of local host

import java.lang.*;
        import java.net.*;

public class getOwnIP_1a {
    public static void main(String args[]) throws UnknownHostException {
        try {
            InetAddress IPO = InetAddress.getLocalHost();
            System.out.println("IP of this system=" + IPO.getHostAddress());
        } catch (Exception e) {
            System.out.println("Exception    caught=" + e.getMessage());
        }
    }
}