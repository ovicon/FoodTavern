package ro.ovidiuconeac.foodtavern.businesslayer.exceptions;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class AddFoodException extends Exception {

    private static final long serialVersionUID = 100L;

    public AddFoodException() {
        super("Unable to add food to database.");
    }
}
