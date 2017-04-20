/**
 * Created by ovidiu on 3/22/17.
 */
function FoodUseCases(presenter) {

    // Use case 'get Fruit'
    FoodUseCases.prototype.getFruit = function () {
        debugger;
        var url = 'http://localhost:1984/food/fruits/random';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                presenter.postFruit(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                presenter.postFruitRequestError(textStatus);
            }
        });
    }

    // Use case 'get all Fruits'
    FoodUseCases.prototype.getAllFruits = function() {
        debugger;
        var url = 'http://localhost:1984/food/fruits/all';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                presenter.postAllFruits(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                presenter.postAllFruitsRequestError(textStatus);
            }
        });
    }

    // Use case 'add new fruit'
    FoodUseCases.prototype.addNewFruit = function(fruit) {
        debugger;
        var url = 'http://localhost:1984/food/fruits/new';
        $.ajax({
            type: 'POST',
            contentType: 'application/json',
            url: url,
            data: JSON.stringify(fruit),
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                presenter.postAddNewFruitRequestSuccess(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                // TODO
            }
        });
    }

    // Use case 'get Cheese'
    FoodUseCases.prototype.getCheese = function() {
        debugger;
        var url = 'http://localhost:1984/food/cheeses/random';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                presenter.postCheese(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                presenter.postCheeseRequestError(textStatus);
            }
        });
    }

    // Use case 'get all Cheese'
    FoodUseCases.prototype.getAllCheeses = function() {
        debugger;
        var url = 'http://localhost:1984/food/cheeses/all';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                presenter.postAllCheeses(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                // TODO
            }
        });
    }

    // Use case 'add new cheese'
    FoodUseCases.prototype.addNewCheese = function(cheese) {
        debugger;
        var url = 'http://localhost:1984/food/cheeses/new';
        $.ajax({
            type: 'POST',
            contentType: 'application/json',
            url: url,
            data: JSON.stringify(cheese),
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                // TODO
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                // TODO
            }
        });
    }

    // Use case 'get Sweet'
    FoodUseCases.prototype.getSweet = function() {
        debugger;
        var url = 'http://localhost:1984/food/sweets/random';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                presenter.postSweet(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                // TODO
            }
        });
    }

    // Use case 'get all Sweets'
    FoodUseCases.prototype.getAllSweets = function() {
        debugger;
        var url = 'http://localhost:1984/food/sweets/all';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                presenter.postAllSweets(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                // TODO
            }
        });
    }

    // Use case 'add new sweet'
    FoodUseCases.prototype.addNewSweet = function(sweet) {
        debugger;
        var url = 'http://localhost:1984/food/sweets/new';
        $.ajax({
            type: 'POST',
            contentType: 'application/json',
            url: url,
            data: JSON.stringify(sweet),
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                debugger;
                // TODO
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                debugger;
                // TODO
            }
        });
    }
}