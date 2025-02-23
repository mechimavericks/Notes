package Lab.Unit1n2;//Experiment no 2
//Objective:Program to obtain the information about the (a)Host (b)Port(c) Protocol
import java.lang.*;
import java.net.*;

public class url_2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.bizzinus.com");
        try {
            System.out.println("host name is " + url.getHost());
            System.out.println("port no. is " + url.getPort());
            System.out.println("protocol used is " + url.getProtocol());

        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}
