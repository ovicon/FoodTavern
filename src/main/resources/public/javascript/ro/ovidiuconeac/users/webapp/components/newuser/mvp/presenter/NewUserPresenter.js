"use strict";

/**
 * Created by ovidiu on 3/24/17.
 */
function NewUserPresenter(view) {

    debugger;

    var model = new NewUserUseCases();

    NewUserPresenter.prototype.requestSaveUser = function (db, user) {
        debugger;
        if (Utility.getInstance().isUserValid(user)) {
            model.saveUser(db, user);
            view.postSaveUserSuccessful();
            view.requestResetUserInterface();
        } else {
            view.postWrongUserInput();
        }
        view.requestResetUserMessage();
    }
}