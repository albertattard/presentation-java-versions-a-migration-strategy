package demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringRemoteFunction extends Remote {
    String upper(String text) throws RemoteException;
}
