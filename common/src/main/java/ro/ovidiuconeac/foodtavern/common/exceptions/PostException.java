package ro.ovidiuconeac.foodtavern.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Unable to add food to database.")
public class PostException extends Exception {

    private static final long serialVersionUID = 100L;

    public PostException() {
        super("Unable to add food to database.");
    }
}
