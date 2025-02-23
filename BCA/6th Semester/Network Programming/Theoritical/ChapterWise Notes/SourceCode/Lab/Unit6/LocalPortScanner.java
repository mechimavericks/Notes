package Lab.Unit6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class LocalPortScanner {
    public static void main(String[] args) throws UnknownHostException {
            InetAddress remote = InetAddress.getLocalHost();
            String hostname = remote.getHostName();
            for (int port = 1; port < 65536; port++) {
                try {
                    Socket s = new Socket(remote, port);
                    System.out.println("A server is listening on port "+ port + " of " + hostname);
                    s.close();
                }
            catch (IOException ex) {
                    // The remote host is not listening on this port
                }
            }
    }
}
