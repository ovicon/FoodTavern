function ServerConnectionUseCases(presenter) {

    // Use case "Get server connection"
    ServerConnectionUseCases.prototype.getServerConnection = function () {
        var url = 'http://localhost:1984/serverconnection';
        jQuery.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {
                $('#server_connection')
                    .text('The server connection for your client is: ' + result.scheme + '://' + result.host + ':' + result.port);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, ' + textStatus + ', please check the configured port: ' + url);
            }
        });
    }
}