package Lab.Unit3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URL_EXAMPLE {
    public static void main(String args[]) {
        try {
            String location = "https://lolcats.com/";
            URL url = new URL(location);
            InputStream is = url.openStream();
            int c;
            char data;
            while ((c = is.read()) != -1) {
                data = (char) c;
                System.out.print(data);
            }
            is.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            {
               // br.lines().forEach(System.out::println);
            }


//            String line;
//            while((line=br.readLine()) != null){
//                System.out.println(line);
//            }



        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
