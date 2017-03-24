/**
 * Created by ovidiu on 3/24/17.
 */
function ServerConnectionView() {

    var presenter = new ServerConnectionPresenter(this);

    ServerConnectionView.prototype.requestServerConnection = function () {
        presenter.requestServerConnection();
    }
}