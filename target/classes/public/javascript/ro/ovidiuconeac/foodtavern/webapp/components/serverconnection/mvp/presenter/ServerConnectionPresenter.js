/**
 * Created by ovidiu on 3/24/17.
 */
function ServerConnectionPresenter(view) {

    var model = new ServerConnectionUseCases(this);

    ServerConnectionPresenter.prototype.requestServerConnection = function () {
        model.getServerConnection();
    }

    ServerConnectionPresenter.prototype.postServerConnection = function (serverConnection) {
        view.postServerConnection(serverConnection);
    }
}