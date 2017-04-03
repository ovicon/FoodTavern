/**
 * Created by ovidiu on 4/3/17.
 */
function Main() {

    Main.prototype.launch = function() {
        $(function(){
            $("#includedContent").load("ro/ovidiuconeac/foodtavern/webapp/components/food/mvp/view/FoodView.html");
        });
    }
}