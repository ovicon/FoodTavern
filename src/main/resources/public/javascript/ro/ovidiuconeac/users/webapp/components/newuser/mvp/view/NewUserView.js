"use strict";

/**
 * Created by ovidiu on 3/24/17.
 */
function NewUserView() {

    debugger;

    var db = firebase.database();
    var presenter = new NewUserPresenter(this);
    var back = undefined;
    var name = undefined;
    var age = undefined;
    var sex = undefined;
    var save = undefined;
    var message = undefined;

    NewUserView.prototype.onCreateView = function () {
        debugger;
        $('#includedContent').load('resources/layout/new_user_view.html', function () {
            debugger;
            back = $('#back_button');
            back.on('click', function () {
                debugger;
                new UsersView();
            });
            name = $('#name');
            age = $('#age');
            sex = $('#sex');
            save = $('#save_button');
            save.on('click', function () {
                debugger
                NewUserView.prototype.requestSaveUser()
            });
            message = $('#message');
        });
    }();

    NewUserView.prototype.requestSaveUser = function () {
        debugger;
        presenter.requestSaveUser(db, {
            name: name.val(),
            age: age.val(),
            sex: sex.children("option").filter(":selected").text()
        });
    }

    NewUserView.prototype.postSaveUserSuccessful = function () {
        debugger;
        message.text('New user added successfully');
        message.css('color', 'green');
    }

    NewUserView.prototype.postWrongUserInput = function () {
        debugger;
        message.text('Check Input');
        message.css('color', 'red');
    }

    NewUserView.prototype.requestResetUserInterface = function () {
        debugger;
        name.val('');
        age.val('');
        sex.val('').change();
    }

    NewUserView.prototype.requestResetUserMessage = function () {
        debugger;
        setTimeout(function () {
            debugger
            message.text('');
        }, 1500);
    }
}