package Lab.Unit9;
// https://www.tutorialspoint.com/bytebuffer-compact-method-in-java

import java.nio.*;
import java.util.*;
public class CompactBuffer {
    public static void main(String[] args) {
        int n = 6;
        try {
            ByteBuffer buffer = ByteBuffer.allocate(n);
            buffer.put((byte)20);
            buffer.put((byte)30);
            buffer.put((byte)40);
            buffer.put((byte)50);
            buffer.put((byte)60);
            buffer.put((byte)70);
            System.out.println("The Original ByteBuffer is: " + Arrays.toString(buffer.array()));
            System.out.println("The position is: " + buffer.position());
            System.out.println("The limit is: " + buffer.limit());
            buffer.position(3);
            ByteBuffer bufferCompact = buffer.compact();
            bufferCompact.put((byte)99);
            System.out.println("\nThe Compacted ByteBuffer is: " + Arrays.toString(bufferCompact.array()));
            System.out.println("The position is: " + bufferCompact.position());
            System.out.println("The limit is: " + bufferCompact.limit());
        } catch (IllegalArgumentException e) {
            System.out.println("Error!!! IllegalArgumentException");
        } catch (ReadOnlyBufferException e) {
            System.out.println("Error!!! ReadOnlyBufferException");
        }
    }
}