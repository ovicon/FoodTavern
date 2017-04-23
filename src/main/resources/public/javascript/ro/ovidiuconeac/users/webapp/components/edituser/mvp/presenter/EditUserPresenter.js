"use strict";

/**
 * Created by ovidiu on 3/22/17.
 */
function EditUserPresenter(view) {

    debugger;

    var model = new EditUserUseCases();

    EditUserPresenter.prototype.requestUpdateUser = function (db, user) {
        debugger;
        if (Utility.getInstance().isUserValid(user)) {
            model.updateUser(db, user)
            view.postUpdateUserSuccessful();
            view.requestShowUsers();
        } else {
            view.postWrongUserInput();
        }
        view.requestResetUserMessage();
    }

    EditUserPresenter.prototype.requestRemoveUser = function (db, user) {
        debugger;
        if (Utility.getInstance().isUserValid(user)) {
            model.removeUser(db, user);
            view.requestResetUserInterface()
            view.postRemoveUserSuccessful();

            view.requestShowUsers();
        } else {
            view.postWrongUserInput();
        }
        view.requestResetUserMessage();
    }
}