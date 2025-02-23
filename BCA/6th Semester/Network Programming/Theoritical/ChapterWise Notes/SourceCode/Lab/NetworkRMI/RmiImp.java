package Lab.NetworkRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RmiImp extends UnicastRemoteObject implements RmiServerIntf {

    public static final String MESSAGE = "Hello World";

    public RmiImp() throws RemoteException {
        super(0);
    }

    public String getMessage() {
        return MESSAGE;
    }
}