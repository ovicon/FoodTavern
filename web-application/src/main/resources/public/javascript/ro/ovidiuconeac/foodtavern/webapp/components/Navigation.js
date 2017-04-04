/**
 * Created by ovidiu on 4/3/17.
 */
var NavigationController = (function () {
    var instance;

    function createInstance() {
        var object = function () {

            object.prototype.showFoodUI = function() {
                $(function(){
                    $("#includedContent").load("ro/ovidiuconeac/foodtavern/webapp/components/food/mvp/view/FoodView.html");
                });
            }

            object.prototype.showServerConnectionUI = function() {
                $(function(){
                    $("#includedContent").load("ro/ovidiuconeac/foodtavern/webapp/components/serverconnection/mvp/view/ServerConnectionView.html");
                });
            }

        };
        return object;
    }

    return {
        getInstance: function () {
            if (!instance) {
                instance = createInstance();
            }
            return instance;
        }
    };
})();