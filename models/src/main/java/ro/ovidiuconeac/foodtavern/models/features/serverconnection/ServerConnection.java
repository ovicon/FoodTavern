package ro.ovidiuconeac.foodtavern.models.features.serverconnection;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
public class ServerConnection {

    private String scheme;
    private String host;
    private String port;

    public ServerConnection(String scheme, String host, String port) {
        this.scheme = scheme;
        this.host = host;
        this.port = port;
    }

    public String getScheme() {
        return scheme;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }
}
