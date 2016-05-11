package dollynho;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by vinimaz on 5/5/16.
 */
public class ClientImpl extends UnicastRemoteObject implements InterfaceCli{
    InterfaceServ refServidor;
    protected ClientImpl(InterfaceServ refServidor) throws RemoteException {
        this.refServidor    = refServidor;
    }
}
