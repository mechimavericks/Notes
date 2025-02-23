package Lab.Unit4;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class CookiesStoreRemove {
    public static void main(String[] args) {

        CookieManager manager = new CookieManager();
        CookieStore store = manager.getCookieStore();
        URI uri1 = URI.create("http://spm.com.np");
        HttpCookie c1 = new HttpCookie("cart1", "1");
       //add
        store.add(uri1, c1);
        //read cookies
        List cl = store.getCookies();
        System.out.println(cl + "\n");
        // remove one cookie
       store.remove(uri1,c1);
        List cr = store.getCookies();
        System.out.println(cr + "\n");
        // all remove cookies
        store.removeAll();
        List empty = store.getCookies();
        System.out.println(empty + "\n");
    }
}
