package Lab.Unit5;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class readDataP1 {
    public static void main(String[] args) {
        try {
            URL location = new URL("http://spm.com.np/");
            URLConnection conn = location.openConnection();
            InputStream is = conn.getInputStream();
            int Line;
            while ((Line = is.read()) != -1) {
                System.out.print((char) Line);
            }
            is.close();
        } catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    }
}

