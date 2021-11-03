package demo;

import java.rmi.MarshalledObject;
import java.rmi.RemoteException;
import java.rmi.activation.Activatable;
import java.rmi.activation.ActivationException;
import java.rmi.activation.ActivationID;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.util.Locale;

public class DefaultStringRemoteFunction extends Activatable implements StringRemoteFunction {

    protected DefaultStringRemoteFunction(final String location, final MarshalledObject<?> data,
                                          final boolean restart, final int port) throws ActivationException,
            RemoteException {
        super(location, data, restart, port);
    }

    protected DefaultStringRemoteFunction(final String location, final MarshalledObject<?> data,
                                          final boolean restart, final int port, final RMIClientSocketFactory csf,
                                          RMIServerSocketFactory ssf) throws ActivationException, RemoteException {
        super(location, data, restart, port, csf, ssf);
    }

    protected DefaultStringRemoteFunction(final ActivationID id, final int port, RMIClientSocketFactory csf,
                                          final RMIServerSocketFactory ssf) throws RemoteException {
        super(id, port, csf, ssf);
    }

    protected DefaultStringRemoteFunction(final ActivationID id, final int port) throws RemoteException {
        super(id, port);
    }

    @Override
    public String upper(String text) throws RemoteException {
        return text == null ? null : text.toUpperCase(Locale.ROOT);
    }
}
