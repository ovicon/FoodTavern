"use strict";

/**
 * Created by ovidiu on 3/22/17.
 */
function EditUserUseCases() {

    debugger;

    EditUserUseCases.prototype.updateUser = function (db, user) {
        debugger;
        var ref = db.ref('users/' + user.id);
        ref.set(user);
    }

    EditUserUseCases.prototype.removeUser = function (db, user) {
        debugger;
        var ref = db.ref('users/' + user.id);
        ref.set(null);
    }
}