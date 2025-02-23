package Lab.Unit9;
// https://www.geeksforgeeks.org/bytebuffer-putint-methods-in-java-with-examples/
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
public class DataConversionTest {
    public static void main ( String[] args ) {
        int capacity= 8;
        try {
            ByteBuffer bb = ByteBuffer.allocate(capacity);
            bb.asIntBuffer().put(10).put(20);
            bb.rewind();
            // print the ByteBuffer
            System.out.println("Original ByteBuffer: ");
            for (int i = 1; i <= capacity / 4; i++) {
                System.out.println(bb.getInt() + "");
            }
            bb.rewind();
            int value = bb.getInt();
            System.out.println("\n\n Byte Value: " + value);
            int value1 = bb.getInt();
            System.out.println("Next Byte Value: " + value1);
            int value3 = bb.getInt();
            System.out.println("Next Byte Value: " + value3);
            // continue..
        }catch(BufferUnderflowException ex){
                System.out.println("\n There are fewer than" + "four bytes remainiing in this buffer");
                System.out.println("Exception Thrown: " + ex);
        }
    }
}
