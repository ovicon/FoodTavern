"use strict";

/**
 * Created by ovidiu on 3/24/17.
 */
function NewUserUseCases() {

    debugger;

    NewUserUseCases.prototype.saveUser = function (db, user) {
        debugger;
        // Creates a user with an unique ID
        var ref = db.ref('users');
        ref.push(user);
    }
}