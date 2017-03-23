/**
 * Created by ovidiu on 3/22/17.
 */
function FoodView() {

    // Fruit
    var progressBarFruit = $('#progress_bar_fruit');
    var fruit = $('#fruit');
    var getFruit = $('#get_fruit');
    var progressBarAllFruits = $('#progress_bar_all_fruits');
    var getAllFruits = $('#get_all_fruits');
    var newFruit = $('#new_fruit');

    // Cheese
    var progressBarCheese = $('#progress_bar_cheese');
    var cheese = $('#cheese');
    var getCheese = $('#get_cheese');
    var progressBarAllCheeses = $('#progress_bar_all_cheeses');
    var getAllCheeses = $('#get_all_cheeses');
    var newFruit = $('#new_cheese');

    // Sweet
    var progressBarSweet = $('#progress_bar_sweet ');
    var sweet = $('#sweet');
    var getSweet = $('#get_sweet');
    var progressBarAllSweets = $('#progress_bar_all_sweets');
    var getAllSweets = $('#new_sweet');

    // jQuery
    var presenter = new FoodPresenter(this);

    FoodView.prototype.requestFruit = function () {
        enableUiFruit(false);
        presenter.requestFruit();
    }

    FoodView.prototype.postFruit = function(name) {
        fruit.value = name;
        enableUiFruit(true);
    }

    function enableUiFruit(enable) {
        if (enable) {
            progressBarFruit.hide();
            fruit.removeAttr('disabled');
            getFruit.removeAttr('disabled');
        } else {
            progressBarFruit.show();
            fruit.attr('disabled', 'true');
            getFruit.attr('disabled', 'true');
        }
    }
    
    FoodView.prototype.requestAllFruits = function () {
        presenter.requestAllFruits();
    }

    FoodView.prototype.requestAddNewFruit = function(fruit) {

    }

    FoodView.prototype.requestCheese = function () {
        enableUiCheese(false);
        presenter.requestCheese();
    }

    FoodView.prototype.postCheese = function(name) {
        cheese.value = name;
        enableUiCheese(true);
    }

    function enableUiCheese(enable) {
        if (enable) {
            progressBarCheese.hide();
            cheese.removeAttr('disabled');
            getCheese.removeAttr('disabled');
        } else {
            progressBarCheese.show();
            cheese.attr('disabled', 'true');
            getCheese.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAllCheeses = function () {
        presenter.requestAllCheeses();
    }

    FoodView.prototype.requestAddNewCheese = function(cheese) {

    }

    FoodView.prototype.requestSweet = function () {
        enableUiSweet(false);
        presenter.requestSweet();
    }

    FoodView.prototype.postSweet = function(name) {
        sweet.value = name;
        enableUiSweet(true);
    }

    function enableUiSweet(enable) {
        if (enable) {
            progressBarSweet.hide();
            sweet.removeAttr('disabled');
            getSweet.removeAttr('disabled');
        } else {
            progressBarSweet.show();
            sweet.attr('disabled', 'true');
            getSweet.attr('disabled', 'true');
        }
    }

    FoodView.prototype.requestAllSweets = function () {
        presenter.requestAllSweets();
    }

    FoodView.prototype.requestAddNewSweet = function(sweet) {

    }
}