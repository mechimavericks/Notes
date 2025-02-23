package Lab.Unit8;


import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

public class Server {
    public static void main (String[] args) throws IOException {
        System.setProperty("javax.net.ssl.keyStore", "D:\\Notes\\TU\\bca 6 th sem\\Network Programming\\ppt\\pratical_lab\\za.store" );
        System.setProperty("javax.net.ssl.keyStorePassword", "password" ) ;
        //SSLServerSocketFactory ssf = (SSLServerSocketFactory)SSLServerSocketFactory.getDefault();
        ServerSocket serverSocket =((SSLServerSocketFactory)SSLServerSocketFactory.getDefault()).createServerSocket(4444);
        System.out.println ("Server up & ready for connections ");
        while (true) new ServerThread(serverSocket.accept()).start();
    }
}