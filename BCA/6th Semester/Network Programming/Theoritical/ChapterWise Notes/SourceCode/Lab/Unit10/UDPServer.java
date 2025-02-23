package Lab.Unit10;

import java.net.*;
import java.util.Date;

public class UDPServer {
    public static void main ( String[] args ) throws Exception{
        DatagramSocket ss = new DatagramSocket(9876); //Socket() and Bind()
        InetAddress ia = InetAddress.getByName("localhost");
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        while (true){
            DatagramPacket revPkt = new DatagramPacket(receiveData,receiveData.length);
            ss.receive(revPkt);
           /* String daytime = new Date().toString();
            byte[] data = daytime.getBytes("US-ASCII");*/
            String sentence = new String(revPkt.getData());
            System.out.println("Recived: " + sentence);
            InetAddress ip = revPkt.getAddress();
            int port = revPkt.getPort();
            sendData = sentence.getBytes();
            DatagramPacket sndPkt = new DatagramPacket(sendData,sendData.length,ip,port);
            ss.send(sndPkt); // SendTo()
        }
    }
}
