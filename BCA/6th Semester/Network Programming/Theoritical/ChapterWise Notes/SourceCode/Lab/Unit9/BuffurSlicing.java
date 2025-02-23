package Lab.Unit9;
// https://www.geeksforgeeks.org/floatbuffer-slice-method-in-java-with-examples/
// Java program to demonstrate
// slice() method

import java.nio.*;
import java.util.*;

public class BuffurSlicing {

    public static void main(String[] args)
    {
        // Declaring the capacity of the ByteBuffer
        int capacity = 5;
        // Creating the ByteBuffer
        try {
            // creating object of ByteBuffer
            // and allocating size capacity
            ByteBuffer bb1 = ByteBuffer.allocate(capacity);
            // putting the value in ByteBuffer
            bb1.put((byte)10);
            bb1.put((byte)20);
            // print the ByteBuffer
            System.out.println("Original ByteBuffer: "
                    + Arrays.toString(bb1.array()));
            // print the ByteBuffer position
            System.out.println("\nposition: " + bb1.position());
            // print the ByteBuffer capacity
            System.out.println("\ncapacity: " + bb1.capacity());
            // Creating a shared subsequence buffer of given ByteBuffer
            // using slice() method
            ByteBuffer bb2 = bb1.slice();
            // print the shared subsequence buffer
            System.out.println("\nshared subsequence ByteBuffer: "
                    + Arrays.toString(bb2.array()));
            // print the ByteBuffer position
            System.out.println("\nposition: " + bb2.position());
            // print the ByteBuffer capacity
            System.out.println("\ncapacity: " + bb2.capacity());
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException catched");
        }
        catch (ReadOnlyBufferException e) {
            System.out.println("ReadOnlyBufferException catched");
        }
    }
}

