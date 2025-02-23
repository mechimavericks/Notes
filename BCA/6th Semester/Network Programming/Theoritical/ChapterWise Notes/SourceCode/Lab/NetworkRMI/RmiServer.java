package Lab.NetworkRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;



public class RmiServer  {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        System.out.println("RmiServer Strarted");


        try{

            LocateRegistry.createRegistry(1099);
            System.out.println("java RMI registry created");
            RmiImp obj = new RmiImp();
            Naming.rebind("rmi://localhost/RmiServer",obj);
            System.out.println("PeerServer bound in registy");
        }
        catch(RemoteException re){

            System.out.println("java RMI registry already exist");
        }
    }

}
