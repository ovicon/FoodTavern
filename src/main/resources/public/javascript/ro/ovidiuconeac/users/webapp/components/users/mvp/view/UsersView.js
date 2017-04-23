"use strict";

/**
 * Created by ovidiu on 3/22/17.
 */

function UsersView() {

    debugger;

    var db = firebase.database();
    var presenter = new UsersPresenter(this);
    var addNew = undefined;
    var loading = undefined;
    var usersTable = undefined;

    UsersView.prototype.onCreateView = function () {
        debugger;
        $('#includedContent').load('resources/layout/users_view.html', function () {
            debugger;
            addNew = $('#add_new_button');
            addNew.click(function () {
                debugger;
                new NewUserView();
            });
            loading = $('#loading_users');
            usersTable = $('#users_table');
            UsersView.prototype.requestShowUsers();
        });
    }();

    UsersView.prototype.requestShowUsers = function() {
        debugger;
        presenter.requestShowUsers(db);
    }

    UsersView.prototype.postShowUsers = function(users) {
        debugger;
        $.each(users, function (index, user) {
            debugger;
            var newRow = '<br>' +
                '<div class=\"row\" id=\"' + user.id + '\"> ' +
                '<div class=\"column\" id=\"name\">' + user.name + '</div> ' +
                '<div class=\"column\" id=\"age\">' + user.age + '</div> ' +
                '<div class=\"column\" id=\"sex\">' + user.sex + '</div> ' +
                '</div>';
            usersTable.append(newRow);
        });
        $('.row').click(function () {
            debugger;
            var parent = $(this);
            var user = {
                id: parent.attr('id'),
                name: parent.find('#name').html(),
                age: parent.find('#age').html(),
                sex: parent.find('#sex').html()
            }
            debugger;
            UsersView.prototype.requestEditUser(user);
        });
        loading.hide();
    }

    UsersView.prototype.requestEditUser = function(user) {
        debugger;
        new EditUserView(user);
    }
}