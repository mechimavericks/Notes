package Lab.Unit1n2;

import java.io.*;
import java.net.*;

        public class MyServer{

        public static void main(String[]args){
                try{

        ServerSocket ss=new ServerSocket(6666);

        Socket s=ss.accept();//establishesconnection

        DataInputStream dis=new DataInputStream(s.getInputStream());

        String str=(String)dis.readUTF();//return utf to string

        System.out.println("message="+str);

        ss.close();

        }catch(Exception e){System.out.println(e);}

        }

        }