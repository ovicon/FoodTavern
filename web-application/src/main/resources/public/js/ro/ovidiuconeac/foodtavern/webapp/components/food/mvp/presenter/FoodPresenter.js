/**
 * Created by ovidiu on 3/22/17.
 */
function FoodPresenter(view) {

    var view = view;
    var model = new FoodUseCases();

    FoodPresenter.prototype.requestFruit = function () {
        model.getFruit()
    }


    FoodPresenter.prototype.requestAllFruits = function () {
        model.getAllFruits();
    }

    FoodPresenter.prototype.requestAddNewFruit = function(fruit) {
        var fruit = {};
        fruit["name"] = "caca";
        model.addNewFruit(fruit);
    }

    FoodPresenter.prototype.requestCheese = function () {
        model.getCheese();
    }

    FoodPresenter.prototype.requestAllCheeses = function () {
        model.getAllCheeses();
    }

    FoodPresenter.prototype.requestAddNewCheese = function(cheese) {
        var cheese = {};
        cheese["name"] = "caca";
        model.addNewCheese(cheese);
    }

    FoodPresenter.prototype.requestSweet = function () {
        model.getSweet();
    }

    FoodPresenter.prototype.requestAllSweets = function () {
        model.getAllSweets();
    }

    FoodPresenter.prototype.requestAddNewSweet = function(sweet) {
        var sweet = {};
        sweet["name"] = "caca";
        model.addNewSweet(sweet);
    }
}