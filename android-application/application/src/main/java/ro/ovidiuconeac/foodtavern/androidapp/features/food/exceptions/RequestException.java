package ro.ovidiuconeac.foodtavern.androidapp.features.food.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */

public class RequestException extends Exception {

    public RequestException() {
        super("Unable to contact server.");
    }
}
