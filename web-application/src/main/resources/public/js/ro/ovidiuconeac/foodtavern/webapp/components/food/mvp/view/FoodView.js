/**
 * Created by ovidiu on 3/22/17.
 */
function FoodView() {

    // Fruit
    var progressBarFruit = $('#progress_bar_fruit');
    var fruit = $('#fruit');
    var getFruit = $('#get_fruit');
    var progressBarAllFruits = $('#progress_bar_all_fruits');
    var getAllFruits = $('#');

    // Cheese
    var progressBarCheese = $('#');
    var cheese = $('#');
    var getCheese = $('#');
    var progressBarAllCheeses = $('#');
    var getAllCheeses = $('#');

    // Sweet
    var progressBarSweet = $('#');
    var sweet = $('#');
    var getSweet = $('#');
    var progressBarAllSweets = $('#');
    var getAllSweets = $('#');

    // jQuery
    var presenter = new FoodPresenter(this);

    FoodView.prototype.requestFruit = function () {
        presenter.requestFruit();
    }
    
    FoodView.prototype.requestAllFruits = function () {
        presenter.requestAllFruits();
    }

    FoodView.prototype.requestAddNewFruit = function(fruit) {

    }

    FoodView.prototype.requestCheese = function () {
        presenter.requestCheese();
    }

    FoodView.prototype.requestAllCheeses = function () {
        presenter.requestAllCheeses();
    }

    FoodView.prototype.requestAddNewCheese = function(cheese) {

    }

    FoodView.prototype.requestSweet = function () {
        presenter.requestSweet();
    }

    FoodView.prototype.requestAllSweets = function () {
        presenter.requestAllSweets();
    }

    FoodView.prototype.requestAddNewSweet = function(sweet) {

    }
}