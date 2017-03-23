/**
 * Created by ovidiu on 3/22/17.
 */
function FoodPresenter(view) {

    var view = view;
    var model = new FoodUseCases(view);

    FoodPresenter.prototype.requestFruit = function() {
        var x = model.getFruit()
        view.postFruit(x);
    }

    FoodPresenter.prototype.requestAllFruits = function() {
        model.getAllFruits();
    }

    FoodPresenter.prototype.requestAddNewFruit = function(fruit) {
        var fruitObject = {};
        fruitObject["name"] = fruit;
        model.addNewFruit(fruitObject);
    }

    FoodPresenter.prototype.requestCheese = function() {
        model.getCheese();
    }

    FoodPresenter.prototype.requestAllCheeses = function() {
        model.getAllCheeses();
    }

    FoodPresenter.prototype.requestAddNewCheese = function(cheese) {
        var cheeseObject = {};
        cheeseObject["name"] = cheese;
        model.addNewCheese(cheeseObject);
    }

    FoodPresenter.prototype.requestSweet = function() {
        model.getSweet();
    }

    FoodPresenter.prototype.requestAllSweets = function() {
        model.getAllSweets();
    }

    FoodPresenter.prototype.requestAddNewSweet = function(sweet) {
        var sweetObjects = {};
        sweetObjects["name"] = sweet;
        model.addNewSweet(sweetObjects);
    }
}