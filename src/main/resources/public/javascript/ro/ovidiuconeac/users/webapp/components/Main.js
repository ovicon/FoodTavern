"use strict";

/**
 * Created by ovidiu on 4/3/17.
 */

function Main() {

    debugger;

    Main.prototype.onCreateApplication = function() {
        debugger;

        var indexHead = $('head');

        // Import Users
        var usersModel = document.createElement('script');
        usersModel.src = 'javascript/ro/ovidiuconeac/users/webapp/components/users/mvp/model/UsersUseCases.js';
        indexHead.append(usersModel);
        var usersView = document.createElement('script');
        usersView.src = 'javascript/ro/ovidiuconeac/users/webapp/components/users/mvp/view/UsersView.js';
        indexHead.append(usersView);
        var usersPresenter = document.createElement('script');
        usersPresenter.src = 'javascript/ro/ovidiuconeac/users/webapp/components/users/mvp/presenter/UsersPresenter.js';
        indexHead.append(usersPresenter);

        // Import New User
        var newUserModel = document.createElement('script');
        newUserModel.src = 'javascript/ro/ovidiuconeac/users/webapp/components/newuser/mvp/model/NewUserUseCases.js';
        indexHead.append(newUserModel);
        var newUserView = document.createElement('script');
        newUserView.src = 'javascript/ro/ovidiuconeac/users/webapp/components/newuser/mvp/view/NewUserView.js';
        indexHead.append(newUserView);
        var newUserPresenter = document.createElement('script');
        newUserPresenter.src = 'javascript/ro/ovidiuconeac/users/webapp/components/newuser/mvp/presenter/NewUserPresenter.js';
        indexHead.append(newUserPresenter);

        // Import Edit User
        var editUserModel = document.createElement('script');
        editUserModel.src = 'javascript/ro/ovidiuconeac/users/webapp/components/edituser/mvp/model/EditUserUseCases.js';
        indexHead.append(editUserModel);
        var editUserView = document.createElement('script');
        editUserView.src = 'javascript/ro/ovidiuconeac/users/webapp/components/edituser/mvp/view/EditUserView.js';
        indexHead.append(editUserView);
        var editUserPresenter = document.createElement('script');
        editUserPresenter.src = 'javascript/ro/ovidiuconeac/users/webapp/components/edituser/mvp/presenter/EditUserPresenter.js';
        indexHead.append(editUserPresenter);

        // Import Util
        var util = document.createElement('script');
        util.src = 'javascript/ro/ovidiuconeac/users/webapp/common/Util.js';
        indexHead.append(util);

        // Set view
        new UsersView();
    }();
}