package Lab.Unit9;
// https://www.geeksforgeeks.org/buffer-duplicate-method-in-java-with-examples/

import java.nio.*;
import java.util.*;

public class DuplicateBuffer {

    public static void main(String[] args)
    {

        // Declaring the capacity of the ByteBuffer
        int capacity = 4;

        // Creating the ByteBuffer
        try {

            // creating object of ByteBuffer
            // and allocating size capacity
            ByteBuffer bb1
                    = ByteBuffer.allocate(capacity);

            // putting the int to byte typecast
            // value in ByteBuffer
            bb1.put((byte)20);
            bb1.put((byte)30);
            bb1.put((byte)40);
            bb1.put((byte)50);
            bb1.rewind();

            // print the Original ByteBuffer
            System.out.println("Original ByteBuffer: "
                    + Arrays.toString(bb1.array()));

            // Creating a duplicate copy of ByteBuffer
            // using duplicate() method
            ByteBuffer bb2 = bb1.duplicate();

            // print the duplicate copy of ByteBuffer
            System.out.print("\nDuplicate ByteBuffer: "
                    + Arrays.toString(bb2.array()));
        }

        catch (IllegalArgumentException e) {

            System.out.println("Exception thrown : " + e);
        }

        catch (ReadOnlyBufferException e) {

            System.out.println("Exception thrown : " + e);
        }
    }
}
