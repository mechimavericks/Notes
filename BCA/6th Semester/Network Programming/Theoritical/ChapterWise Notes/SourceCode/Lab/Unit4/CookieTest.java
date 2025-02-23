package Lab.Unit4;

import java.net.*;
import java.util.List;

public class CookieTest {
    public static void main(String[] args) {

        CookieManager manager = new CookieManager();


        HttpCookie c1 = new HttpCookie("user1", "1");
        URI uri1 = URI.create("http://spm.gov");

        manager.setCookiePolicy(new NoGovernmentCookies("spm.edu.np"));

      /*  manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        manager.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);*/
        CookieHandler.setDefault(manager);

//        cs. add(uri1, c1);

        CookieStore cs = manager.getCookieStore();
        //read stored cookies
        List cl = cs.getCookies();
      System.out.println("cookies list in cookiestore" + cl + "\n");
    }

}