/**
 * Created by ovidiu on 3/22/17.
 */
function FoodPresenter(view) {

    var model = new FoodUseCases(this);

    FoodPresenter.prototype.requestFruit = function() {
        model.getFruit()
    }

    FoodPresenter.prototype.postFruit = function(fruit) {
        view.postFruit(fruit.name);
    }

    FoodPresenter.prototype.requestAllFruits = function() {
        model.getAllFruits();
    }

    FoodPresenter.prototype.postAllFruits = function(fruits) {
        view.postAllFruits(getNamesAsStringFrom(fruits))
    }

    FoodPresenter.prototype.postFruitRequestError = function(msg) {
        view.postFruitRequestError(msg);
    }

    FoodPresenter.prototype.postAllFruitsRequestError = function (msg) {
        view.postAllFruitsRequestError(msg);
    }

    FoodPresenter.prototype.requestAddNewFruit = function(fruit) {
        var fruitObject = {};
        fruitObject["name"] = fruit;
        model.addNewFruit(fruitObject);
    }

    FoodPresenter.prototype.postAddNewFruitRequestSuccess = function(msg) {
        view.postAddNewFruitRequestSuccess(msg);
    }

    FoodPresenter.prototype.requestCheese = function() {
        model.getCheese();
    }

    FoodPresenter.prototype.postCheese = function(cheese) {
        view.postCheese(cheese.name);
    }

    FoodPresenter.prototype.requestAllCheeses = function() {
        model.getAllCheeses();
    }

    FoodPresenter.prototype.postAllCheeses = function(cheeses) {
        view.postAllCheeses(getNamesAsStringFrom(cheeses));
    }

    FoodPresenter.prototype.postCheeseRequestError = function (msg) {
        view.postCheeseRequestError(msg);
    }

    FoodPresenter.prototype.postAllCheesesRequestError = function (msg) {
        view.postAllCheesesRequestError(msg);
    }

    FoodPresenter.prototype.requestAddNewCheese = function(cheese) {
        var cheeseObject = {};
        cheeseObject["name"] = cheese;
        model.addNewCheese(cheeseObject);
    }

    FoodPresenter.prototype.postAddNewCheeseRequestSuccess = function(msg) {
        view.postAddNewCheeseRequestSuccess(msg);
    }

    FoodPresenter.prototype.requestSweet = function() {
        model.getSweet();
    }

    FoodPresenter.prototype.postSweet = function(sweet) {
        view.postSweet(sweet.name);
    }

    FoodPresenter.prototype.requestAllSweets = function() {
        model.getAllSweets();
    }

    FoodPresenter.prototype.postAllSweets = function(sweets) {
        view.postAllSweets(getNamesAsStringFrom(sweets));
    }

    FoodPresenter.prototype.postSweetRequestError = function (msg) {
        view.postSweetRequestError(msg);
    }

    FoodPresenter.prototype.postAllSweetsRequestError = function (msg) {
        view.postAllSweetsRequestError(msg);
    }

    FoodPresenter.prototype.requestAddNewSweet = function(sweet) {
        var sweetObjects = {};
        sweetObjects["name"] = sweet;
        model.addNewSweet(sweetObjects);
    }

    FoodPresenter.prototype.postAddNewSweetRequestSuccess = function(msg) {
        view.postAddNewSweetRequestSuccess(msg);
    }

    function getNamesAsStringFrom(food) {
        var buf = '';
        for (var i=0; i<food.length; i++) {
            buf += food[i].name;
            buf += '\n';
        }
        return buf;
    }
}