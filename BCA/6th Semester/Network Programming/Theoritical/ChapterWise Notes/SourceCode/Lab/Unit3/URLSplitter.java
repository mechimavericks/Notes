package Lab.Unit3;

import java.io.IOException;
import java.net.URL;

public class URLSplitter {
    public static void main(String args[]) throws IOException {

        String location = "https://docs.oracle.com/javase/7/docs/api/java/net/URL.html#getContent()";
        URL url = new URL(location);

        System.out.println("Authority : " +url.getAuthority());
        System.out.println("Deafult Port : " +url.getDefaultPort());
        System.out.println("File : " +url.getFile());
        System.out.println("Host : " +url.getHost());
        System.out.println("Path : " +url.getPath());
        System.out.println("Port : " +url.getPort());
        System.out.println("Protocol : " +url.getProtocol());
        System.out.println("Query : " +url.getQuery());
        System.out.println("Reference (Anchor) : " +url.getRef());
        System.out.println("User Info : " +url.getUserInfo());
    }
}
