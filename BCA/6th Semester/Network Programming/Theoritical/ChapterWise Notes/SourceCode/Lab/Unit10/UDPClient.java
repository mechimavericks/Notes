package Lab.Unit10;

import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main ( String[] args ) throws  Exception{
        System.out.println("Enter any Text");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket cs = new DatagramSocket(); //Socket()
        InetAddress ia = InetAddress.getByName("localhost");
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];
        String sentence = br.readLine();
        sendData = sentence.getBytes();

        DatagramPacket sndPkt = new DatagramPacket(sendData,sendData.length,ia,9876);
        cs.send(sndPkt); //SendTo()

        DatagramPacket revPkt = new DatagramPacket(receiveData,receiveData.length);
        cs.receive(revPkt); //ReceiveFrom()

        String modifiedSentence = new String(revPkt.getData());
        System.out.println("From Server:" + modifiedSentence);
        cs.close();
    }
}
