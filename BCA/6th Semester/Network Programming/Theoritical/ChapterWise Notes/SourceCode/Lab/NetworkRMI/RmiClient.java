package Lab.NetworkRMI;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RmiClient {
    public static void main(String[] args) throws Exception {
        RmiServerIntf obj = (RmiServerIntf) Naming.lookup("rmi://localhost/RmiServer");
        System.out.println(obj.getMessage());
    }
}
