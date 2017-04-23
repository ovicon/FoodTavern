"use strict";

/**
 * Created by ovidiu on 3/22/17.
 */
function EditUserView(user) {

    debugger;

    var db = firebase.database();
    var presenter = new EditUserPresenter(this);
    var back = undefined;
    var name = undefined;
    var age = undefined;
    var sex = undefined;
    var remove = undefined;
    var save = undefined;
    var message = undefined;

    EditUserView.prototype.onCreateView = function () {
        debugger;
        $('#includedContent').load('resources/layout/edit_user_view.html', function () {
            debugger;
            back = $('#back_button');
            back.on('click', function () {
                debugger;
                new UsersView();
            });
            name = $('#name');
            name.val(user.name);
            age = $('#age');
            age.val(user.age);
            sex = $('#sex');
            sex.val(user.sex);
            remove = $('#remove_button');
            remove.on('click', function () {
                debugger;
                EditUserView.prototype.requestRemoveUser();
            });
            save = $('#save_button');
            save.on('click', function () {
                debugger;
                EditUserView.prototype.requestUpdateUser();
            });
            message = $('#message');
        });
    }();

    EditUserView.prototype.requestUpdateUser = function () {
        debugger;
        presenter.requestUpdateUser(db, {
            id: user.id,
            name: name.val(),
            age: age.val(),
            sex: sex.children("option").filter(":selected").text()
        });
    }

    EditUserView.prototype.postUpdateUserSuccessful = function () {
        debugger;
        message.text('User modified successfully');
        message.css('color', 'green');
    }

    EditUserView.prototype.requestRemoveUser = function () {
        debugger;
        presenter.requestRemoveUser(db, user);
    }

    EditUserView.prototype.postRemoveUserSuccessful = function () {
        debugger;
        message.text('User removed successfully');
        message.css('color', 'green');
    }

    EditUserView.prototype.postWrongUserInput = function () {
        debugger;
        message.text('Check Input');
        message.css('color', 'red');
    }

    EditUserView.prototype.requestResetUserInterface = function () {
        debugger;
        name.val('');
        age.val('');
        sex.val('');
    }

    EditUserView.prototype.requestResetUserMessage = function () {
        debugger;
        setTimeout(function () {
            debugger
            message.text('');
        }, 1500);
    }

    EditUserView.prototype.requestShowUsers = function () {
        debugger;
        setTimeout(function () {
            debugger
            new UsersView();
        }, 250);
    }
}