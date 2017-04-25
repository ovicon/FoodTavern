package ro.ovidiuconeac.foodtavern.businesslayer.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class EmptyResultException extends Exception {

    private static final long serialVersionUID = 100L;

    public EmptyResultException() {
        super("No result found in database.");
    }
}
