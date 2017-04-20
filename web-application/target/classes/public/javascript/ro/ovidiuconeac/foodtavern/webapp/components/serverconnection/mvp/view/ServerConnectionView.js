/**
 * Created by ovidiu on 3/24/17.
 */
function ServerConnectionView() {

    var presenter = new ServerConnectionPresenter(this);
    var serverConnection;
    var buttonShowFood;

    ServerConnectionView.prototype.onCreateView = function () {
        debugger;
        $('#includedContent').load('resources/layout/ServerConnectionView.html', function () {
            debugger;
            serverConnection = $('#server_connection');
            buttonShowFood = $('#button_show_food');
            buttonShowFood.on('click', function () {
                debugger;
                new FoodView();
            });
            presenter.requestServerConnection();
        });
    }();

    ServerConnectionView.prototype.postServerConnection = function (value) {
        debugger;
        serverConnection.val(value);
    }
}