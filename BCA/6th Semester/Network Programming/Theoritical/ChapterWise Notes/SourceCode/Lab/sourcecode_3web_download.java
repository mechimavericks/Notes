package Lab;//Experiment no 3
//Objective: Program to read the source code of the web
import java.lang.*;
import java.io.*;
import java.net.*;

public class sourcecode_3web_download {
public static void main(String[] args) throws MalformedURLException {
        try {
            URL url = new URL("https://www.daraz.com.np/");
            URLConnection urlcon = url.openConnection();
            InputStream ip = urlcon.getInputStream();
            boolean flag = true;
            while (flag) {
                int a = ip.read();
                if (a == -1) {
                    flag = false;
                } else {
                    char c = (char) a;
                    System.out.print(c);
                }
            }
            ip.close();
        } catch (Exception e){
            System.out.println("error" + e);
        }

    }
}
