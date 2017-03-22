/**
 * Created by ovidiu on 3/22/17.
 */
function FoodView() {

    var c = function cucu() {
        alert('');
    }

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