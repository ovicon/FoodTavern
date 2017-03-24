/**
 * Created by ovidiu on 3/22/17.
 */
function FoodUseCases(presenter) {

    // Use case "get Fruit"
    FoodUseCases.prototype.getFruit = function () {
        var result1;
        var url = 'http://localhost:1984/food/fruits/random';
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                presenter.postFruit(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                presenter.postFruitRequestError(textStatus);
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
            async: 'true',
            success: function successCallback(result) {
                presenter.postAllFruits(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                presenter.postAllFruitsRequestError(textStatus);
            }
        });
    }

    // Use case "add new fruit"
    FoodUseCases.prototype.addNewFruit = function(fruit) {
        var url = 'http://localhost:1984/food/fruits/new';
        $.ajax({
            type: 'PUT',
            contentType: "application/json",
            url: url,
            data: JSON.stringify(fruit),
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                presenter.postAddNewFruitRequestSuccess(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                // TODO
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
            async: 'true',
            success: function successCallback(result) {
                presenter.postCheese(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                presenter.postCheeseRequestError(textStatus);
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
            async: 'true',
            success: function successCallback(result) {
                presenter.postAllCheeses(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                // TODO
            }
        });
    }

    // Use case "add new cheese"
    FoodUseCases.prototype.addNewCheese = function(cheese) {
        var url = 'http://localhost:1984/food/cheeses/new';
        $.ajax({
            type: 'PUT',
            contentType: "application/json",
            url: url,
            data: JSON.stringify(cheese),
            dataType: "json",
            async: 'true',
            success: function successCallback(result) {
                // TODO
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                // TODO
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
            async: 'true',
            success: function successCallback(result) {
                presenter.postSweet(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                // TODO
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
            async: 'true',
            success: function successCallback(result) {
                presenter.postAllSweets(result);
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                // TODO
            }
        });
    }

    // Use case "add new sweet"
    FoodUseCases.prototype.addNewSweet = function(sweet) {
        var url = 'http://localhost:1984/food/sweets/new';
        $.ajax({
            type: 'PUT',
            contentType: "application/json",
            url: url,
            data: JSON.stringify(sweet),
            dataType: 'json',
            async: 'true',
            success: function successCallback(result) {
                // TODO
            },
            error: function errorCallback(xhr, textStatus, errorThrown) {
                // TODO
            }
        });
    }
}