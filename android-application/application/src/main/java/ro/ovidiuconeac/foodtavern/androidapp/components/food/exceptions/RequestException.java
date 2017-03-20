package ro.ovidiuconeac.foodtavern.androidapp.components.food.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */

public class RequestException extends AndroidAppException {

    public RequestException() {
        super("Unable to contact server.");
    }
}
