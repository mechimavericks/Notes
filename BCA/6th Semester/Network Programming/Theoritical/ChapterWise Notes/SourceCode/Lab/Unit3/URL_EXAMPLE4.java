package Lab.Unit3;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class URL_EXAMPLE4 {
    public static void main(String args[]) {

        try {
            String location = "https://spm.com.np";
            URL url = new URL(location);

            Class<?>[] types = new Class[3];
            types[0] = String.class;
            types[1] = Reader.class;
            types[2] = InputStream.class;
            Object o = url.getContent(types);
            System.out.println(o.getClass().getName());
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
