/**
 * Created by ovidiu on 3/22/17.
 */
function FoodView() {

    debugger;

    var presenter = new FoodPresenter(this);

    // Fruit
    var progressBarFruit;
    var fruit;
    var getFruit;
    var progressBarAllFruits;
    var getAllFruits;
    var newFruit;

    // Cheese
    var progressBarCheese;
    var cheese;
    var getCheese;
    var progressBarAllCheeses;
    var getAllCheeses;
    var newCheese;

    // Sweet
    var progressBarSweet;
    var sweet;
    var getSweet;
    var progressBarAllSweets;
    var getAllSweets;
    var newSweet;

    var buttonShowServerConnection;
    var _this;

    FoodView.prototype.onCreateView = function () {
        debugger;
        $('#includedContent').load('resources/layout/FoodView.html', function () {
            debugger;
            // Fruit
            progressBarFruit = $('#progress_bar_fruit');
            fruit = $('#fruit');
            getFruit = $('#get_fruit');
            getFruit.on('click', function () {
                debugger;
                _this.requestFruit();
            });
            progressBarAllFruits = $('#progress_bar_all_fruits');
            getAllFruits = $('#get_all_fruits');
            getAllFruits.on('click', function () {
                debugger;
                _this.requestAllFruits();
            });
            newFruit = $('#new_fruit');
            newFruit.on('click', function () {
                debugger;
                _this.addNewFruit();
            });

            // Cheese
            progressBarCheese = $('#progress_bar_cheese');
            cheese = $('#cheese');
            getCheese = $('#get_cheese');
            getCheese.on('click', function () {
                debugger;
                _this.requestCheese();
            });
            progressBarAllCheeses = $('#progress_bar_all_cheeses');
            getAllCheeses = $('#get_all_cheeses');
            getAllCheeses.on('click', function () {
                debugger;
                _this.requestAllCheeses();
            });
            newCheese = $('#new_cheese');
            newCheese.on('click', function () {
                debugger;
                _this.addNewCheese();
            });

            // Sweet
            progressBarSweet = $('#progress_bar_sweet ');
            sweet = $('#sweet');
            getSweet = $('#get_sweet');
            getSweet.on('click', function () {
                debugger;
                _this.requestSweet()
            });
            progressBarAllSweets = $('#progress_bar_all_sweets');
            getAllSweets = $('#get_all_sweets');
            getAllSweets.on('click', function () {
                debugger;
                _this.requestAllSweets();
            });
            newSweet = $('#new_sweet');
            newSweet.on('click', function () {
                debugger;
                _this.addNewSweet();
            });
            buttonShowServerConnection = $('#button_show_server_connection');
            buttonShowServerConnection.on('click', function () {
                debugger;
                new ServerConnectionView();
            });
            _this = FoodView.prototype
        });
    }();

    FoodView.prototype.requestFruit = function () {
        debugger;
        _this.enableUiFruit(false);
        presenter.requestFruit();
    }

    FoodView.prototype.postFruit = function(name) {
        debugger;
        fruit.val(name);
        _this.enableUiFruit(true);
    }

    FoodView.prototype.enableUiFruit = function(enable) {
        debugger;
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
        debugger;
        _this.enableUiAllFruits(false);
        presenter.requestAllFruits();
    }

    FoodView.prototype.postAllFruits = function (names) {
        debugger;
        alert(names);
        _this.enableUiAllFruits(true);
    }

    FoodView.prototype.enableUiAllFruits = function(enable) {
        debugger;
        if (enable) {
            progressBarAllFruits.css('visibility', 'hidden');
            getAllFruits.removeAttr('disabled');
        } else {
            progressBarAllFruits.css('visibility', 'visible');
            getAllFruits.attr('disabled', 'true');
        }
    }

    FoodView.prototype.postFruitRequestError = function (msg) {
        debugger;
        alert(msg);
    }

    FoodView.prototype.postAllFruitsRequestError = function (msg) {
        debugger;
        alert(msg);
    }

    FoodView.prototype.addNewFruit = function() {
        debugger;
        var fruitName = prompt('Add New Fruit');
        presenter.requestAddNewFruit(fruitName);
    }

    FoodView.prototype.requestAddNewFruit = function(name) {
        debugger;
        presenter.requestAddNewFruit(name);
    }

    FoodView.prototype.postAddNewFruitRequestSuccess = function (msg) {
        debugger;
        // TODO
    }

    FoodView.prototype.requestCheese = function () {
        debugger;
        _this.enableUiCheese(false);
        presenter.requestCheese();
    }

    FoodView.prototype.postCheese = function(name) {
        debugger;
        cheese.val(name);
        _this.enableUiCheese(true);
    }

    FoodView.prototype.enableUiCheese = function(enable) {
        debugger;
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
        debugger;
        _this.enableUiAllCheeses(false);
        presenter.requestAllCheeses();
    }

    FoodView.prototype.postAllCheeses = function (names) {
        debugger;
        alert(names);
        _this.enableUiAllCheeses(true);
    }

    FoodView.prototype.enableUiAllCheeses = function(enable) {
        debugger;
        if (enable) {
            progressBarAllCheeses.css('visibility', 'hidden');
            getAllCheeses.removeAttr('disabled');
        } else {
            progressBarAllCheeses.css('visibility', 'visible');
            getAllCheeses.attr('disabled', 'true');
        }
    }

    FoodView.prototype.postCheeseRequestError = function (msg) {
        debugger;
        alert(msg);
    }

    FoodView.prototype.postAllCheesesRequestError = function (msg) {
        debugger;
        alert(msg);
    }

    FoodView.prototype.addNewCheese = function() {
        debugger;
        var cheeseName = prompt('Add New Cheese');
        presenter.requestAddNewCheese(cheeseName);
    }

    FoodView.prototype.requestAddNewCheese = function(name) {
        debugger;
        presenter.requestAddNewCheese(name);
    }

    FoodPresenter.prototype.postAddNewCheeseRequestSuccess = function(msg) {
        debugger;
        // TODO
    }

    FoodView.prototype.requestSweet = function () {
        debugger;
        _this.enableUiSweet(false);
        presenter.requestSweet();
    }

    FoodView.prototype.postSweet = function(name) {
        debugger;
        sweet.val(name);
        _this.enableUiSweet(true);
    }

    FoodView.prototype.enableUiSweet = function(enable) {
        debugger;
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
        debugger;
        _this.enableUiAllSweets(false);
        presenter.requestAllSweets();
    }

    FoodView.prototype.postAllSweets = function (names) {
        debugger;
        alert(names);
        _this.enableUiAllSweets(true);
    }

    FoodView.prototype.enableUiAllSweets = function(enable) {
        debugger;
        if (enable) {
            progressBarAllSweets.css('visibility', 'hidden');
            getAllSweets.removeAttr('disabled');
        } else {
            progressBarAllSweets.css('visibility', 'visible');
            getAllSweets.attr('disabled', 'true');
        }
    }

    FoodView.prototype.postSweetRequestError = function (msg) {
        debugger;
        alert(msg);
    }

    FoodView.prototype.postAllSweetsRequestError = function (msg) {
        debugger;
        alert(msg);
    }

    FoodView.prototype.addNewSweet = function() {
        debugger;
        var sweetName = prompt('Add New Sweet');
        presenter.requestAddNewSweet(sweetName);
    }

    FoodView.prototype.requestAddNewSweet = function(name) {
        debugger;
        presenter.requestAddNewSweet(name);
    }

    FoodView.prototype.postAddNewSweetRequestSuccess = function(msg) {
        debugger;
        // TODO
    }
}