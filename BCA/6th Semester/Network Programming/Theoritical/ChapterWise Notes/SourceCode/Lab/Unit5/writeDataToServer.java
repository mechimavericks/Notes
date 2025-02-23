package Lab.Unit5;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
public class writeDataToServer {
    public static void writeDataToServer(String url, String data) {
        try {
            URL u = new URL(url);

            URLConnection urlConnection = u.openConnection();
            urlConnection.setDoOutput(true);

            OutputStream outputStream = urlConnection.getOutputStream();
            OutputStream buffered = new BufferedOutputStream(outputStream);
            OutputStreamWriter out = new OutputStreamWriter(buffered, "8859_1");

            out.write(data);
            out.flush();
            out.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
