
/**
 * Created by ovidiu on 4/3/17.
 */
var Navigation = (function () {

    // Instance stores a reference to the Singleton
    var instance;

    function init() {
        return {

            showFoodUI: function () {
                $('#includedContent').load('resources/layout/FoodView.html');
            },

            showServerConnectionUI: function () {
                $('#includedContent').load('resources/layout/ServerConnectionView.html');
            }
        };

    };

    return {

        // Get the Singleton instance if one exists
        // or create one if it doesn't
        getInstance: function () {

            if ( !instance ) {
                instance = init();
            }

            return instance;
        }

    };

})();