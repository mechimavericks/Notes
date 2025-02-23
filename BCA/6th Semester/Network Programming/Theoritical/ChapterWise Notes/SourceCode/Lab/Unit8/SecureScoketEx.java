package Lab.Unit8;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class SecureScoketEx {
    public static void main ( String[] args ) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory)SSLSocketFactory.getDefault();
            //System.out.println(factory);
            SSLSocket socket = (SSLSocket) factory.createSocket("tufohss.edu.np", 443);
            String[] supported = socket.getSupportedCipherSuites();
            socket.setEnabledCipherSuites(supported);
            Writer out = new OutputStreamWriter(socket.getOutputStream(),"US-ASCII");
            out.write("GET http://tufohss.edu.np/ HTTP/1.1\r\n");
            out.write("Host:tufohss.edu.np\r\n");
            out.write("\r\n");
            out.flush();
            //Read all header fields
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s;
            while (!(s=in.readLine()).equals("")){
                System.out.println(s);
            }
        } catch (Exception e) {
        }
    }
}