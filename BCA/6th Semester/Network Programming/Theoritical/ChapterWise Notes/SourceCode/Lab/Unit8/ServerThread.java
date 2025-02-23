package Lab.Unit8;

import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    Socket socket;
    ServerThread ( Socket socket ) {
        this.socket = socket;
    }
    public void run() {
        try {

            PrintWriter stdOut = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            stdOut.println(in.readLine());
            while (in.ready()) {
                stdOut.println(in.readLine());
                in.close();
                //BufferedReader commandPromptBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //printWriter.println(commandPromptBufferedReader.readLine());
                //while (true) printWriter.println(commandPromptBufferedReader.readLine() + " echo");
                //PrintWriter printwriter = new PrintWriter(socket.getOutputStream(), true);
            /*PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
            printwriter.print("server");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("user '"+ bufferedReader.readLine()+"' is now connected to the server...");
            while (true) printwriter.println(bufferedReader.readLine() + " echo");*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}