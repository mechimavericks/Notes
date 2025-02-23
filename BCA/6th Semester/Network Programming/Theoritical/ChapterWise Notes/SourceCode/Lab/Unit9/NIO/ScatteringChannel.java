package Lab.Unit9.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ScatteringByteChannel;

public class ScatteringChannel {
    private static String FILENAME = "D:\\Notes\\TU\\bca 6 th sem\\Network Programming\\ppt\\pratical_lab\\Lab\\Unit9\\NIO\\temp.txt";
    public static void main(String[] args) {
        ByteBuffer bLen1 = ByteBuffer.allocate(1024);
        ByteBuffer bLen2 = ByteBuffer.allocate(1024);
        FileInputStream in;
        try {
            in = new FileInputStream(FILENAME);
            ScatteringByteChannel  scatter = in.getChannel();
            scatter.read(new ByteBuffer[] {bLen1, bLen2});
            bLen1.position(0);
            bLen2.position(0);
            int len1 = bLen1.asIntBuffer().get();
            int len2 = bLen2.asIntBuffer().get();
            System.out.println("Scattering : Len1 = " + len1);
            System.out.println("Scattering : Len2 = " + len2);
        }
        catch (FileNotFoundException exObj) {
            exObj.printStackTrace();
        }
        catch (IOException ioObj) {
            ioObj.printStackTrace();
        }
    }
}