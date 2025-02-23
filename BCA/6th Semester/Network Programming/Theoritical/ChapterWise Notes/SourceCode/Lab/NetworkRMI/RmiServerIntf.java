package Lab.NetworkRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiServerIntf extends Remote{
    public String getMessage() throws RemoteException;

}
