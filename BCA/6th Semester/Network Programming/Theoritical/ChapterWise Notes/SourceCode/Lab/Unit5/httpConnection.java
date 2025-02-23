package Lab.Unit5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class httpConnection {

    public static void main(String[] args) throws IOException {
        String url = "http://spm.com.np/";
        HttpURLConnection httpUrlConnection = getURLConnection(url);
        InputStream inputStream = getContent(httpUrlConnection);
        printInputStream(inputStream);
    }

    private static HttpURLConnection getURLConnection(String urlToConnect) throws IOException {
        URL url = new URL(urlToConnect);
        HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
        return httpUrlConnection;
    }

    private static InputStream getContent(HttpURLConnection httpUrlConnection) throws IOException {
        int responseCode = httpUrlConnection.getResponseCode();
        System.out.println(responseCode);
        InputStream inputStream = null;
        if (responseCode >= 200 && responseCode < 400) {
            inputStream = httpUrlConnection.getInputStream();
        } else {
            inputStream = httpUrlConnection.getErrorStream();
        }
        return inputStream;
    }

    private static void printInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}

