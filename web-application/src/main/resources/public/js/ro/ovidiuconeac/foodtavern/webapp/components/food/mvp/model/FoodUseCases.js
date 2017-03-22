function FoodUseCases() {

    // Use case "get Fruit"
    FoodUseCases.prototype.getFruit = function () {
        var url = 'http://localhost:1984/food/fruits/random';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {
                console.log(result.name);
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
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {
                $.each(result, function(index, value){
                    console.log(result[index].name);
                });
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case add new fruit
    FoodUseCases.prototype.addNewFruit = function(fruit) {
        var url = 'http://localhost:1984/food/fruits/new';
        var fruit = {};
        fruit["name"] = "caca";
        $.ajax({
            type: 'PUT',
            contentType: "application/json",
            url: url,
            data: JSON.stringify(fruit),
            dataType: "json",
            success: function successCallback(result) {
                console.log(result.name);
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
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {
                console.log(result.name);
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
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {
                $.each(result, function(index, value){
                    console.log(result[index].name);
                });
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case add new cheese
    FoodUseCases.prototype.addNewCheese = function(cheese) {
        var url = 'http://localhost:1984/food/cheeses/new';
        $.ajax({
            type: 'PUT',
            contentType: "application/json",
            url: url,
            data: JSON.stringify(cheese),
            dataType: "json",
            success: function successCallback(result) {
                console.log(result.name);
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
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {
                console.log(result.name);
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
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            success: function successCallback(result) {
                $.each(result, function(index, value){
                    console.log(result[index].name);
                });
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }

    // Use case add new sweet
    FoodUseCases.prototype.addNewSweet = function(sweet) {
        var url = 'http://localhost:1984/food/sweets/new';
        $.ajax({
            type: 'PUT',
            contentType: "application/json",
            url: url,
            data: JSON.stringify(sweet),
            dataType: "json",
            success: function successCallback(result) {
                console.log(result.name);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                $('#server_connection')
                    .text('Unable to establish server connection, '  + textStatus);
            }
        });
    }
}