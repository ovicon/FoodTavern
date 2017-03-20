package ro.ovidiuconeac.foodtavern.androidapp.components.food.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */

public class NoResultException extends AndroidAppException {

    public NoResultException() {
        super("Data was not found on the server.");
    }
}
