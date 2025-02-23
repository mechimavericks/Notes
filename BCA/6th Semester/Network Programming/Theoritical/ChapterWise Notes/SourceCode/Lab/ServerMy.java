package Lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMy {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String) dis.readUTF();
        System.out.println("Message" + str);

        DataOutputStream douts = new DataOutputStream(s.getOutputStream());
        douts.writeUTF("Hello Client");
        douts.flush();
        douts.close();

        ss.close();

    }
}
