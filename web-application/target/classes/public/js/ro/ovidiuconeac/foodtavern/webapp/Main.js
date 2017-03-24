/**
 * Created by ovidiu on 3/22/17.
 */
function Main() {

    Main.prototype.launch = function () {
        $.getScript('js/ro/ovidiuconeac/foodtavern/webapp/components/serverconnection/mvp/model/ServerConnectionUseCases.js', function(){

            alert('Script loaded but not necessarily executed.');

        });
        new FoodView();
    }

}
