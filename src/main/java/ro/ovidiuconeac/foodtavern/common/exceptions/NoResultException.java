package ro.ovidiuconeac.foodtavern.common.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */

public class NoResultException extends Exception {

    public NoResultException() {
        super("Data was not found on the server.");
    }
}
