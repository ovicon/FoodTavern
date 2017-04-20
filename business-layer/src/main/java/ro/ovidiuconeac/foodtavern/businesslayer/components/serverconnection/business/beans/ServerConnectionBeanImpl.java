package ro.ovidiuconeac.foodtavern.businesslayer.components.serverconnection.business.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.common.models.ServerConnection;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
@Service
public class ServerConnectionBeanImpl implements ServerConnectionBean {

    private final Environment environment;

    // Better for testing
    @Autowired
    public ServerConnectionBeanImpl(Environment environment) {
        this.environment = environment;
    }

    @Override
    public ServerConnection getServerConnection() {
        InetAddress ip = null;
        String host = null;
        try {
            if (InetAddress.getLocalHost().isLoopbackAddress()) {
                // If you use a desktop PC with a cable connection
                host = "10.0.2.2";
            } else {
                ip = InetAddress.getLocalHost();
                host = ip.getHostAddress();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String scheme = "http";
        String port = environment.getProperty("local.server.port");
        return new ServerConnection(scheme, host, port);
    }
}