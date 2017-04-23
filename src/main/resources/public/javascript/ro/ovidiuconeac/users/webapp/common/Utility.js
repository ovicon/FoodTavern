"use strict";

/**
 * Created by ovidiu on 12/04/17.
 */
var Utility = (function () {

    debugger;

    // Instance stores a reference to the Singleton
    var instance;

    function init() {
        return {

            isUserValid: function (user) {
                debugger;
                var validUser = false;

                function isValid(val) {
                    debugger;
                    var valid = false;
                    if (val !== undefined && val !== null && val.length !== 0) {
                        valid = true;
                    }
                    return valid;
                }

                if (user !== undefined
                    && user !== null
                    && isValid(user.name)
                    && isValid(user.age)
                    && isValid(user.sex)
                ) {
                    validUser = true;
                }
                return validUser;
            },
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