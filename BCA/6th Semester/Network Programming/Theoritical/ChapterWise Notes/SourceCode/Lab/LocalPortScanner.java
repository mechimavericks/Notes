package Lab;

import java.io.IOException;
import java.net.ServerSocket;

public class LocalPortScanner {

    public static void main(String args[])
    {
        for(int port=1024;port<=65535;port++){

            try {
                ServerSocket server = new ServerSocket(port);

                System.out.println(+port);
            }catch (IOException ioe){

            }
        }
    }
}
