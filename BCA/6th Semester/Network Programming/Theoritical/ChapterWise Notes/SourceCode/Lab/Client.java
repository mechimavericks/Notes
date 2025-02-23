package Lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
public static void main(String[]args) throws IOException {
        Socket s = new Socket( "localhost", 6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello Server");
        DataInputStream diso = new DataInputStream(s.getInputStream());
        String ser = (String) diso.readUTF();
        System.out.println("Server Msg" + ser);
        dout.flush();
        dout.close();
        s.close();
        }

}
