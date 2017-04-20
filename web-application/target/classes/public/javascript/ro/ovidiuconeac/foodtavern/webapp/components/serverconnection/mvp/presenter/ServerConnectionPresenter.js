/**
 * Created by ovidiu on 3/24/17.
 */
function ServerConnectionPresenter(view) {

    var model = new ServerConnectionUseCases(this);

    ServerConnectionPresenter.prototype.requestServerConnection = function () {
        debugger;
        model.getServerConnection();
    }

    ServerConnectionPresenter.prototype.postServerConnection = function (serverConnection) {
        debugger;
        view.postServerConnection(serverConnection);
    }
}