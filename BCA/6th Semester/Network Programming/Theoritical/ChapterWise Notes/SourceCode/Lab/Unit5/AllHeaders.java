package Lab.Unit5;

import java.io.*;
import java.net.*;
public class AllHeaders {
    public static void main(String[] args) {
            try {
                String resource = "https://www.tufohss.edu.np/";
                /* Construct URL object */
                URL u = new URL(resource);
                URLConnection uc = u.openConnection();
                for (int j = 1; ; j++) {
                    String header = uc.getHeaderField(j);
                    if (header == null) break;
                    System.out.println(uc.getHeaderFieldKey(j) + ": " + header);
                }



            } catch (MalformedURLException ex) {
                System.err.println(" it not a URL I understand.");
            } catch (IOException ex) {
                System.err.println(ex);
            }
            System.out.println();
        }
}
