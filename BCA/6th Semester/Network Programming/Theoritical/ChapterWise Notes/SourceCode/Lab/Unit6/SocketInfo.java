package Lab.Unit6;


import java.net.*;
import java.io.*;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SocketInfo {
    public static void main(String[] args) {
        String urlhost = "spm.com.np";
        try {
            Socket theSocket = new Socket(urlhost, 80);
            System.out.println("Connected to " + theSocket.getInetAddress()
                    + " on port " + theSocket.getPort() + " from port "
                    + theSocket.getLocalPort() + " of "
                    + theSocket.getLocalAddress());
        } catch (UnknownHostException ex) {
            System.err.println("I can't find " + urlhost);
        } catch (SocketException ex) {
            System.err.println("Could not connect to " + urlhost);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
