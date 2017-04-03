/**
 * Created by ovidiu on 4/3/17.
 */
var NavigationController = function () {

    var instance;

    function showFoodUI() {
        $(function(){
            $("#includedContent").load("ro/ovidiuconeac/foodtavern/webapp/components/food/mvp/view/FoodView.html");
        });
    }

    function showServerConnectionUI() {
        $(function(){
            $("#includedContent").load("ro/ovidiuconeac/foodtavern/webapp/components/serverconnection/mvp/view/ServerConnectionView.html");
        });
    }

}