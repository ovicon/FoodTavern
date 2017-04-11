package ro.ovidiuconeac.foodtavern.webapp.components.serverconnection.mvp.model;

import ro.ovidiuconeac.foodtavern.webapp.components.serverconnection.mvp.presenter.ServerConnectionPresenter;

/**
 * Created by ovidiu on 4/10/17.
 */
public class ServerConnectionUseCases {

    ServerConnectionPresenter foodPresenter;

    public ServerConnectionUseCases(ServerConnectionPresenter foodPresenter) {
        this.foodPresenter = foodPresenter;
    }
}
