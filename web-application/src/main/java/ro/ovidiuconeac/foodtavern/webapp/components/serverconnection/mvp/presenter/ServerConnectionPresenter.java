package ro.ovidiuconeac.foodtavern.webapp.components.serverconnection.mvp.presenter;

import ro.ovidiuconeac.foodtavern.webapp.components.serverconnection.mvp.model.ServerConnectionUseCases;
import ro.ovidiuconeac.foodtavern.webapp.components.serverconnection.mvp.view.ServerConnectionView;

/**
 * Created by ovidiu on 4/10/17.
 */
public class ServerConnectionPresenter {

    private ServerConnectionView view;
    private ServerConnectionUseCases model;

    public ServerConnectionPresenter(ServerConnectionView foodView) {
        this.view = foodView;
        this.model = new ServerConnectionUseCases(this);
    }
}
