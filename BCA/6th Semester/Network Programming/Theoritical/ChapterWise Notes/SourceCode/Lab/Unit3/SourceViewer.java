package Lab.Unit3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SourceViewer {
    public static void main(String[] args) {

            try {
                // Open the URLConnection for reading
                URL u = new URL("https://lolcats.com/");
                URLConnection uc = u.openConnection();
                try (InputStream raw = uc.getInputStream()) { // autoclose
                    BufferedReader br = new BufferedReader(new InputStreamReader(raw));
                    {
                        br.lines().forEach(System.out::println);
                    }
                }
            } catch (MalformedURLException ex) {
                System.err.println(args[0] + " is not a parseable URL");
            } catch (IOException ex) {
                System.err.println(ex);
            }


    }
}
