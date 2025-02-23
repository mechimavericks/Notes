package Lab.Unit6;

import java.net.*;
import java.io.*;

public class BetterCat {

    public static void main(String[] args) {


            int port = 80;
            String file = "/";
            try {
                URL u = new URL("http://spm.com.np");;
                if (u.getPort() != -1) port = u.getPort();
                if (!(u.getProtocol().equalsIgnoreCase("http"))) {
                    System.err.println("I only understand http.");
                }
                if (!(u.getFile().equals(""))) file = u.getFile();
                Socket s = new Socket(u.getHost(), port);
                OutputStream theOutput = s.getOutputStream();
                OutputStreamWriter out = new OutputStreamWriter(theOutput);
                out.write("GET " + file + " HTTP/1.0\r\n");
                out.write("Accept: text/plain, text/html, text/*\r\n");
                out.write("\r\n");
                out.flush();
                theOutput.flush();

                InputStream in = s.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);
                int c;
                while ((c = br.read()) != -1) {
                    System.out.print((char) c);
                }
            }
            catch (MalformedURLException ex) {
                System.err.println( " is not a valid URL");
            }
            catch (IOException ex) {
                System.err.println(ex);
            }

        }

}

