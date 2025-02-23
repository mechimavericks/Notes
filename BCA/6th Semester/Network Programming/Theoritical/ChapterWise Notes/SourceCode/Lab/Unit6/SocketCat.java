package Lab.Unit6;

import java.net.*;
import java.io.*;

public class SocketCat {

    public static void main(String[] args) {
            int port = 80;
            String file = "/";
            try {
                URL u = new URL("http://spm.com.np");
                if (u.getPort() != -1) port = u.getPort();
                if (!(u.getProtocol().equalsIgnoreCase("http"))) {
                    System.err.println("I only understand http.");

                }
                if (!(u.getFile().equals(""))) file = u.getFile();
                Socket s = new Socket(u.getHost(), port);
                OutputStream theOutput = s.getOutputStream();
                PrintWriter pw = new PrintWriter(theOutput, false);
                pw.println("GET " + file + " HTTP/1.0");
                pw.println("Accept: text/plain, text/html, text/*");
                pw.println();
                pw.flush();

                InputStream in = s.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);
                String theLine;
                while ((theLine = br.readLine()) != null) {
                    System.out.println(theLine);
                }
            }
            catch (MalformedURLException e) {
                System.err.println(" is not a valid URL");
            }
            catch (IOException ex) {
                System.err.println(ex);
            }

        }
}
