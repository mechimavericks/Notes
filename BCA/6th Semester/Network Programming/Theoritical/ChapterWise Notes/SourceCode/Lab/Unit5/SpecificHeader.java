package Lab.Unit5;
import java.net.URL;
import java.net.URLConnection;
public class SpecificHeader {
    public static void main(String args[]) throws Exception {
        String resource = "https://www.tufohss.edu.np/";

        /* Construct URL object */
        URL url = new URL(resource);

        /* Open URLConnection to this URL */
        URLConnection conn = url.openConnection();

        String contentType = conn.getHeaderField("Content-Type");
        String tranferEncoding = conn.getHeaderField("Transfer-Encoding");
        String lastModified = conn.getHeaderField("Last-Modified");

        System.out.println("contentType : " + contentType);
        System.out.println("tranferEncoding : " + tranferEncoding);
        System.out.println("lastModified : " + lastModified);
    }
}
