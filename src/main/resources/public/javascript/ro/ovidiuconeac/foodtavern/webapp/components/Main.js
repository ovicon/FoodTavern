/**
 * Created by ovidiu on 4/3/17.
 */

var indexHead = $('head');

// Import Food
var foodModel = document.createElement('script');
foodModel.src = 'javascript/ro/ovidiuconeac/foodtavern/webapp/components/food/mvp/model/FoodUseCases.js';
indexHead.append(foodModel);
var foodView = document.createElement('script');
foodView.src = 'javascript/ro/ovidiuconeac/foodtavern/webapp/components/food/mvp/view/FoodView.js';
indexHead.append(foodView);
var foodPresenter = document.createElement('script');
foodPresenter.src = 'javascript/ro/ovidiuconeac/foodtavern/webapp/components/food/mvp/presenter/FoodPresenter.js';
indexHead.append(foodPresenter);

// Import Server Connection
var serverConnectionModel = document.createElement('script');
serverConnectionModel.src = 'javascript/ro/ovidiuconeac/foodtavern/webapp/components/serverconnection/mvp/model/ServerConnectionUseCases.js';
indexHead.append(serverConnectionModel);
var serverConnectionView = document.createElement('script');
serverConnectionView.src = 'javascript/ro/ovidiuconeac/foodtavern/webapp/components/serverconnection/mvp/view/ServerConnectionView.js';
indexHead.append(serverConnectionView);
var serverConnectionPresenter = document.createElement('script');
serverConnectionPresenter.src = 'javascript/ro/ovidiuconeac/foodtavern/webapp/components/serverconnection/mvp/presenter/ServerConnectionPresenter.js';
indexHead.append(serverConnectionPresenter);

// Import Navigation
var navigation = document.createElement('script');
navigation.src = 'javascript/ro/ovidiuconeac/foodtavern/webapp/components/Navigation.js';
indexHead.append(navigation);

function Main() {

    Main.prototype.launch = function() {
        $(function(){
            Navigation.getInstance().showFoodUI();
            //Navigation.getInstance().showServerConnectionUI();
        });
    }
}