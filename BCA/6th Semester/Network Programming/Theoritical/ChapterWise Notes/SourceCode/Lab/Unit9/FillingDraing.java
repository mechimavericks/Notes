package Lab.Unit9;
// https://www.tutorialspoint.com/charbuffer-put-method-in-java
import java.nio.*;
import java.util.*;

public class FillingDraing {

    public static void main(String[] args) {
        int n =10;
      try {
        CharBuffer buffer = CharBuffer.allocate(n);
        //Buffer Filling
        buffer.put('H');
        buffer.put('E');
        buffer.put('L');
        buffer.put('L');
        buffer.put('O');
        // Buffer Draining
        buffer.flip();
        while (buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
            buffer.clear();
          System.out.println("After Cleared");

          buffer.flip();
          while (buffer.hasRemaining()){
              System.out.println(buffer.get());
          }


      /*  char[] arr = buffer.array();
        System.out.println("The CharBuffer is: " + Arrays.toString(arr));*/


    } catch (IllegalArgumentException e) {
        System.out.println("Error!!! IllegalArgumentException");
    } catch (ReadOnlyBufferException e) {
        System.out.println("Error!!! ReadOnlyBufferException");
    }
}
}
