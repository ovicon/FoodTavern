/**
 * Created by ovidiu on 3/22/17.
 */
function FoodPresenter(view) {

    var model = new FoodUseCases(this);
    var _this = FoodPresenter.prototype;

    FoodPresenter.prototype.requestFruit = function() {
        debugger;
        model.getFruit()
    }

    FoodPresenter.prototype.postFruit = function(fruit) {
        debugger;
        view.postFruit(fruit.name);
    }

    FoodPresenter.prototype.requestAllFruits = function() {
        debugger;
        model.getAllFruits();
    }

    FoodPresenter.prototype.postAllFruits = function(fruits) {
        debugger;
        view.postAllFruits(_this.getNamesAsStringFrom(fruits))
    }

    FoodPresenter.prototype.postFruitRequestError = function(msg) {
        debugger;
        view.postFruitRequestError(msg);
    }

    FoodPresenter.prototype.postAllFruitsRequestError = function (msg) {
        debugger;
        view.postAllFruitsRequestError(msg);
    }

    FoodPresenter.prototype.requestAddNewFruit = function(fruit) {
        debugger;
        var fruitObject = {};
        fruitObject['name'] = fruit;
        model.addNewFruit(fruitObject);
    }

    FoodPresenter.prototype.postAddNewFruitRequestSuccess = function(msg) {
        debugger;
        view.postAddNewFruitRequestSuccess(msg);
    }

    FoodPresenter.prototype.requestCheese = function() {
        debugger;
        model.getCheese();
    }

    FoodPresenter.prototype.postCheese = function(cheese) {
        debugger;
        view.postCheese(cheese.name);
    }

    FoodPresenter.prototype.requestAllCheeses = function() {
        debugger;
        model.getAllCheeses();
    }

    FoodPresenter.prototype.postAllCheeses = function(cheeses) {
        debugger;
        view.postAllCheeses(_this.getNamesAsStringFrom(cheeses));
    }

    FoodPresenter.prototype.postCheeseRequestError = function (msg) {
        debugger;
        view.postCheeseRequestError(msg);
    }

    FoodPresenter.prototype.postAllCheesesRequestError = function (msg) {
        debugger;
        view.postAllCheesesRequestError(msg);
    }

    FoodPresenter.prototype.requestAddNewCheese = function(cheese) {
        debugger;
        var cheeseObject = {};
        cheeseObject['name'] = cheese;
        model.addNewCheese(cheeseObject);
    }

    FoodPresenter.prototype.postAddNewCheeseRequestSuccess = function(msg) {
        debugger;
        view.postAddNewCheeseRequestSuccess(msg);
    }

    FoodPresenter.prototype.requestSweet = function() {
        debugger;
        model.getSweet();
    }

    FoodPresenter.prototype.postSweet = function(sweet) {
        debugger;
        view.postSweet(sweet.name);
    }

    FoodPresenter.prototype.requestAllSweets = function() {
        debugger;
        model.getAllSweets();
    }

    FoodPresenter.prototype.postAllSweets = function(sweets) {
        debugger;
        view.postAllSweets(_this.getNamesAsStringFrom(sweets));
    }

    FoodPresenter.prototype.postSweetRequestError = function (msg) {
        debugger;
        view.postSweetRequestError(msg);
    }

    FoodPresenter.prototype.postAllSweetsRequestError = function (msg) {
        debugger;
        view.postAllSweetsRequestError(msg);
    }

    FoodPresenter.prototype.requestAddNewSweet = function(sweet) {
        debugger;
        var sweetObjects = {};
        sweetObjects['name'] = sweet;
        model.addNewSweet(sweetObjects);
    }

    FoodPresenter.prototype.postAddNewSweetRequestSuccess = function(msg) {
        debugger;
        view.postAddNewSweetRequestSuccess(msg);
    }

    FoodPresenter.prototype.getNamesAsStringFrom = function(food) {
        debugger;
        var buf = '';
        for (var i=0; i<food.length; i++) {
            buf += food[i].name;
            buf += '\n';
        }
        return buf;
    }
}