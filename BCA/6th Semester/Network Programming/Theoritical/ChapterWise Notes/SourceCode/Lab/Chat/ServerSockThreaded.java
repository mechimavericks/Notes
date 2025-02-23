package Lab.Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BCA
 */
public class ServerSockThreaded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(ServerSocket ss = new ServerSocket(8888)){
            Socket s = ss.accept();
            Thread send = new Thread(){
                @Override
                public void run(){
                    while(true)
                        try(DataOutputStream dos = new DataOutputStream(s.getOutputStream())){
                            while(true){
                                String input = scanner.nextLine();
                                dos.writeUTF(input);
                                dos.flush();
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(ServerSockThreaded.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
            };
            Thread receive = new Thread(){
                @Override
                public void run(){
                    while(true)
                        try(DataInputStream dis = new DataInputStream(s.getInputStream())){
                            while(true){
                                String str = (String)dis.readUTF();
                                System.out.println(str);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(ServerSockThreaded.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
            };
            send.start();
            receive.start();
        } catch (IOException ex) {
            Logger.getLogger(ServerSockThreaded.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
