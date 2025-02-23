package Lab.Unit8;

import javax.net.ssl.SSLSocketFactory;
import java.net.Socket;
public class ClientSocketEx {
    public static void main ( String[] args ) {
        try{
            SSLSocketFactory factory = (SSLSocketFactory)SSLSocketFactory.getDefault();
            Socket socket = factory.createSocket("localhost",1422);
            System.out.println("Server Connected: " + socket);
            socket.close();
        }catch (Exception e){
        }
    }
}
