package Lab.Unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URL_EXAMPLE2 {
    public static void main(String args[]) {
        try {
            String location = "https://lolcats.com/";
            URL url = new URL(location);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            {
                br.lines().forEach(System.out::println);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
