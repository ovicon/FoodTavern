"use strict";

/**
 * Created by ovidiu on 3/22/17.
 */
function UsersPresenter(view) {

    debugger;

    var model = new UsersUseCases();
    var callback = this;

    UsersPresenter.prototype.requestShowUsers = function(db) {
        debugger;
        model.getAllUsers(db, callback);
    }

    UsersPresenter.prototype.postShowUsers = function(users) {
        debugger;
        view.postShowUsers(users);
    }
}