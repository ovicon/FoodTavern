function FoodUseCases() {

    // Use case "get Fruit"
    FoodUseCases.prototype.getFruit = function () {
        var url = 'http://localhost:1984/food/fruits/random';
        jQuery.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case "get all Fruits"
    FoodUseCases.prototype.getAllFruits = function() {
        var url = 'http://localhost:1984/food/fruits/all';
        jQuery.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case add new fruit
    FoodUseCases.prototype.addNewFruit = function() {
        var url = 'http://localhost:1984/food/fruits/new';
        jQuery.ajax({
            type: 'PUT',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case "get Cheese"
    FoodUseCases.prototype.getCheese = function() {
        var url = 'http://localhost:1984/food/cheeses/random';
        jQuery.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case "get all Cheese"
    FoodUseCases.prototype.getAllCheeses = function() {
        var url = 'http://localhost:1984/food/cheeses/all';
        jQuery.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case add new cheese
    FoodUseCases.prototype.addNewCheese = function() {
        var url = 'http://localhost:1984/food/fruits/new';
        jQuery.ajax({
            type: 'PUT',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case "get Sweet"
    FoodUseCases.prototype.getSweet = function() {
        var url = 'http://localhost:1984/food/sweets/random';
        jQuery.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case "get all Sweets"
    FoodUseCases.prototype.getAllSweets = function() {
        var url = 'http://localhost:1984/food/sweets/all';
        jQuery.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case add new sweet
    FoodUseCases.prototype.addNewSweet = function() {
        var url = 'http://localhost:1984/food/fruits/new';
        jQuery.ajax({
            type: 'PUT',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {

            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }
}