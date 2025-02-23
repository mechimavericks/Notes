package Lab.Unit8;


import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocketFactory;
public class ServerSocketEx {
    public static void main ( String[] args ) {
        try{
            SSLServerSocketFactory factory = (SSLServerSocketFactory)SSLServerSocketFactory.getDefault();
            ServerSocket serverSocket = factory.createServerSocket(1422);
            Socket s = serverSocket.accept();
            System.out.println(s + "Client Accepted and connected....");
            s.close();
        }catch (Exception e){
        }
    }
}
