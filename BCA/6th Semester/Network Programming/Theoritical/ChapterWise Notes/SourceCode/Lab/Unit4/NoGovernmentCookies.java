package Lab.Unit4;

import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

public class NoGovernmentCookies implements CookiePolicy {
    //@Override

    String acceptedProxy;

    public NoGovernmentCookies(String acceptedProxy) {
        this.acceptedProxy = acceptedProxy;
    }

    public boolean shouldAccept(URI uri, HttpCookie cookie){
        if(uri.getAuthority().toLowerCase().endsWith(".gov") ||
        cookie.getDomain().toLowerCase().endsWith(".gov")){
            return false;
        }
        //return true;

        return CookiePolicy.ACCEPT_ORIGINAL_SERVER
                .shouldAccept(uri, cookie);
    }
}