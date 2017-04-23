"use strict";

/**
 * Created by ovidiu on 3/22/17.
 */
function UsersUseCases() {

    debugger;

    UsersUseCases.prototype.getAllUsers = function (db, callback) {
        debugger;
        var users = [];
        var ref = db.ref('/users/');
        ref.once('value', function(snapshot) {
            debugger;
            snapshot.forEach(function(childSnapshot) {
                debugger;
                var id = childSnapshot.key;
                var childData = childSnapshot.val();
                users.push({
                    id: id,
                    name: childData.name,
                    age: childData.age,
                    sex: childData.sex
                });
            });
            callback.postShowUsers(users);
        });
    }
}