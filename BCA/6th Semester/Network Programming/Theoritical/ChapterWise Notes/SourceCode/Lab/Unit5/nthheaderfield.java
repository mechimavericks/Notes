package Lab.Unit5;

import java.net.URL;
import java.net.URLConnection;

public class nthheaderfield {
    public static void main(String args[]) throws Exception {
        String resource = "http://spm.com.np/";
        /* Construct URL object */
        URL url = new URL(resource);
        /* Open URLConnection to this URL */
        URLConnection conn = url.openConnection();
        for (int i = 1;; i++) {
            String headerField = conn.getHeaderFieldKey(i);
            if (headerField == null) {
                break;
            }
            System.out.println(headerField + " : " + conn.getHeaderField(i));
        }
    }
}
