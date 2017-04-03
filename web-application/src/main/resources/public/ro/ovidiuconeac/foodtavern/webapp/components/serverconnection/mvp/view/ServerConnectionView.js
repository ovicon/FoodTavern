/**
 * Created by ovidiu on 3/24/17.
 */
function ServerConnectionView() {

    var serverConnection = $('server_connection');
    var presenter = new ServerConnectionPresenter(this);
    presenter.requestServerConnection();

    ServerConnectionView.prototype.postServerConnection = function (value) {
        serverConnection.val(value);
    }

    NavigationController.
}