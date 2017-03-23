/**
 * Created by ovidiu on 3/22/17.
 */
function FoodView() {

    // Fruit
    var progressBarFruit = $('#progress_bar_fruit');
    var fruit = $('#fruit');
    var getFruit = $('#get_fruit');
    getFruit.click(function () {
        FoodView.prototype.requestFruit();
    });
    var progressBarAllFruits = $('#progress_bar_all_fruits');
    var getAllFruits = $('#get_all_fruits');
    getAllFruits.click(function () {
        FoodView.prototype.requestAllFruits();
    });
    var newFruit = $('#new_fruit');
    newFruit.click(function () {
        // TODO use dialogs
    });

    // Cheese
    var progressBarCheese = $('#progress_bar_cheese');
    var cheese = $('#cheese');
    var getCheese = $('#get_cheese');
    getCheese.click(function () {
        FoodView.prototype.requestCheese();
    });
    var progressBarAllCheeses = $('#progress_bar_all_cheeses');
    var getAllCheeses = $('#get_all_cheeses');
    getAllCheeses.click(function () {
        FoodView.prototype.requestAllCheeses();
    });
    var newCheese = $('#new_cheese');
    newFruit.click(function () {
        // TODO use dialogs
    });

    // Sweet
    var progressBarSweet = $('#progress_bar_sweet ');
    var sweet = $('#sweet');
    var getSweet = $('#get_sweet');
    getSweet.click(function () {
        FoodView.prototype.requestSweet()
    });
    var progressBarAllSweets = $('#progress_bar_all_sweets');
    var getAllSweets = $('#get_all_sweets');
    getAllSweets.click(function () {
        FoodView.prototype.requestAllSweets();
    });
    var newSweet = $('#new_sweet');
    newSweet.click(function () {
        // TODO use dialogs
    });

    // jQuery
    var presenter = new FoodPresenter(this);

    FoodView.prototype.requestFruit = function () {
        enableUiFruit(false);
        presenter.requestFruit();
    }

    FoodView.prototype.postFruit = function(name) {
        fruit.val(name);
        enableUiFruit(true);
    }

    function enableUiFruit(enable) {
        if (enable) {
            progressBarFruit.css('visibility', 'hidden');
            fruit.removeAttr('disabled');
            getFruit.removeAttr('disabled');
        } else {
            progressBarFruit.css('visibility', 'visible');
            fruit.attr('disabled', 'true');
            getFruit.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAllFruits = function () {
        enableUiAllFruits(false);
        presenter.requestAllFruits();
    }

    FoodView.prototype.postAllFruits = function (names) {
        alert(names);
        enableUiAllFruits(true);
    }

    function enableUiAllFruits(enable) {
        if (enable) {
            progressBarAllFruits.css('visibility', 'hidden');
            getAllFruits.removeAttr('disabled');
        } else {
            progressBarAllFruits.css('visibility', 'visible');
            getAllFruits.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAddNewFruit = function(name) {
        presenter.requestAddNewFruit(name);
    }

    FoodView.prototype.requestCheese = function () {
        enableUiCheese(false);
        presenter.requestCheese();
    }

    FoodView.prototype.postCheese = function(name) {
        cheese.val(name);
        enableUiCheese(true);
    }

    function enableUiCheese(enable) {
        if (enable) {
            progressBarCheese.css('visibility', 'hidden');
            cheese.removeAttr('disabled');
            getCheese.removeAttr('disabled');
        } else {
            progressBarCheese.css('visibility', 'visible');
            cheese.attr('disabled', 'true');
            getCheese.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAllCheeses = function () {
        enableUiAllCheeses(false);
        presenter.requestAllCheeses();
    }

    FoodView.prototype.postAllCheese = function (names) {
        alert(names);
        enableUiAllCheeses(true);
    }

    function enableUiAllCheeses(enable) {
        if (enable) {
            progressBarAllCheeses.css('visibility', 'hidden');
            getAllCheeses.removeAttr('disabled');
        } else {
            progressBarAllCheeses.css('visibility', 'visible');
            getAllCheeses.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAddNewCheese = function(name) {
        presenter.requestAddNewCheese(name);
    }

    FoodView.prototype.requestSweet = function () {
        enableUiSweet(false);
        presenter.requestSweet();
    }

    FoodView.prototype.postSweet = function(name) {
        sweet.val(name);
        enableUiSweet(true);
    }

    function enableUiSweet(enable) {
        if (enable) {
            progressBarSweet.css('visibility', 'hidden');
            sweet.removeAttr('disabled');
            getSweet.removeAttr('disabled');
        } else {
            progressBarSweet.css('visibility', 'visible');
            sweet.attr('disabled', 'true');
            getSweet.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAllSweets = function () {
        enableUiAllSweets(false);
        presenter.requestAllSweets();
    }

    FoodView.prototype.postAllSweets = function (names) {
        alert(names);
        enableUiAllSweets(true);
    }

    function enableUiAllSweets(enable) {
        if (enable) {
            progressBarAllSweets.css('visibility', 'hidden');
            getAllSweets.removeAttr('disabled');
        } else {
            progressBarAllSweets.css('visibility', 'visible');
            getAllSweets.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAddNewSweet = function(name) {
        presenter.requestAddNewSweet(name);
    }
}