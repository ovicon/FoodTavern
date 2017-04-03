/**
 * Created by ovidiu on 4/3/17.
 */
function NavigationController() {

    NavigationController.prototype.showFoodUI = function() {
        $(function(){
            $("#includedContent").load("ro/ovidiuconeac/foodtavern/webapp/components/food/mvp/view/FoodView.html");
        });
    }

    NavigationController.prototype.showServerConnectionUI = function() {
        $(function(){
            $("#includedContent").load("ro/ovidiuconeac/foodtavern/webapp/components/serverconnection/mvp/view/ServerConnectionView.html");
        });
    }
}