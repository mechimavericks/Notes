package Lab.Unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ContentGetter {
    public static void main(String args[]) throws IOException {

        String location = "http://www.spm.com.np";
        String location1 = "https://1.bp.blogspot.com/-ZkVlJyYzOTM/X2qu9IfpwwI/AAAAAAAAAZA/EfKhh9Y9AZE8WWt7TkLUgvBzKjhqMM8YQCLcBGAsYHQ/w640-h394/netbean%2Bargument.PNG";
        URL url = new URL(location1);

        Object content = url.getContent();
        System.out.println(content.getClass().getName());
    }
}
