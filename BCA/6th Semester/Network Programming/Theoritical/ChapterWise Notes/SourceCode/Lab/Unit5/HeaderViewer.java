package Lab.Unit5;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
public class HeaderViewer {
    public static void main(String args[]) throws Exception {
        String resource = "http://spm.com.np/";
        /* Construct URL object */
        URL url = new URL(resource);
        /* Open URLConnection to this URL */
        URLConnection conn = url.openConnection();
        String contentType = conn.getContentType();
        System.out.println("contentType = " + contentType);
        int conLengthInt = conn.getContentLength();
        System.out.println("conLengthInt = " + conLengthInt);
        long contentLengthLong = conn.getContentLengthLong();
        System.out.println("contentLengthLong = " + contentLengthLong);
        String contentEncoding = conn.getContentEncoding();
        System.out.println("contentEncoding = " + contentEncoding);

        long dateInMillis = conn.getDate();
        Date documentSent = new Date(dateInMillis);
        System.out.println("documentSent = " + documentSent);
        long expirationMillis = conn.getExpiration();
        Date expireDate = new Date(expirationMillis);
        System.out.println("expireDate = " + expireDate);
        long lastModifiedMills = conn.getLastModified();
        Date lastModifiedDate = new Date(lastModifiedMills);
        System.out.println("lastModifiedDate = " + lastModifiedDate);

    }
}
