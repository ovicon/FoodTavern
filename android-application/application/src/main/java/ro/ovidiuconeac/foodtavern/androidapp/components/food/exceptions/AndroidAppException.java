package ro.ovidiuconeac.foodtavern.androidapp.components.food.exceptions;

/**
 * Created by www.ovidiuconeac.ro on 3/20/17.
 */

public abstract class AndroidAppException extends Exception {

    AndroidAppException(String message) {
        super(message);
    }
}
