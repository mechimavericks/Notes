package Lab.Unit5;

// Java Program to Illustrate Use
// of HttpURLConnection Class
// to Retrieve Emotion score of Image
// Using Microsoft Emotion API

// Importing required classes

import org.json.simple.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Main class
// httpconclass class
public class httpImpl {

    // Main driver method
    public static void main(String args[])
            throws IOException
    {

        // Reading input via BufferedReader class
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String key = "833921b016964f95905442e0fab0c229";
        JSONObject ezm;

        while (n-- > 0) {
            String image = br.readLine();
            ezm = new JSONObject();
            ezm.put("url", image);

            // Try block to check for exceptions
            try {
                String u = "http://spm.com.np/";
                // URL for microsoft cognitive server.
                URL url = new URL(u);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();

                // Setting the request method and
                // properties.
                con.setRequestMethod("GET");
                //con.setRequestProperty("Ocp-Apim-Subscription-Key", key);
                con.setRequestProperty("Content-Type", "application/json");
                con.setRequestProperty("Accept", "application/json");

                // As we know the length of our content,
                // the following function sets the fixed
                // streaming mode length 83 bytes. If
                // content length not known, comment the
                // below line.
                con.setFixedLengthStreamingMode(83);

                // Setting the auto redirection to true
                HttpURLConnection.setFollowRedirects(true);

                // Overriding the default value set by
                // the static method setFollowRedirect above
                con.setInstanceFollowRedirects(false);

                // Setting the doOutput to true for now
                con.setDoOutput(true);

                OutputStream out = con.getOutputStream();
                // System.out.println(ezm.toString().getBytes().length);

                // Writing on the output stream
                out.write(ezm.toString().getBytes());
                InputStream ip = con.getInputStream();

                BufferedReader br1 = new BufferedReader(new InputStreamReader(ip));

                // Printing the response code
                // and response message from server.
                System.out.println("Response Code:" + con.getResponseCode());
                System.out.println("Response Message:" + con.getResponseMessage());

                // Note: Uncomment the following line to
                // print the status of FollowRedirect
                // property
                // System.out.println("FollowRedirects:"
                //		 +
                //		 HttpURLConnection.getFollowRedirects());

                // Printing the status of
                // instanceFollowRedirect property
                System.out.println( "InstanceFollowRedirects:" + con.getInstanceFollowRedirects());

                // Printing the 1st header field
                System.out.println("Header field 1:" + con.getHeaderField(1));

                // Printing if usingProxy flag set or not
                System.out.println("Using proxy:" + con.usingProxy());

                StringBuilder response = new StringBuilder();
                String responseSingle = null;

                while ((responseSingle = br1.readLine())!= null) {
                    response.append(responseSingle);
                }
                String xx = response.toString();
                System.out.println(xx);
            }

            // Catch block to handle exceptions
            catch (Exception e) {

                // Display exception/s on console
                System.out.println(e.getMessage());
            }
        }
    }
}
