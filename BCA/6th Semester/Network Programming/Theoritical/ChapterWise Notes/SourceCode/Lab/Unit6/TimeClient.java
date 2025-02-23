package Lab.Unit6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Date;

public class TimeClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("time.nist.gov" , 13);
            InputStream in = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, "ASCII");
            BufferedReader br = new BufferedReader(isr);
             br.lines().forEach(System.out::println);
            System.out.println(new Date().toString());

//            int c;
//            while ((c = br.read()) != -1) {
//                System.out.print((char) c);
//            }
            System.out.println();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
