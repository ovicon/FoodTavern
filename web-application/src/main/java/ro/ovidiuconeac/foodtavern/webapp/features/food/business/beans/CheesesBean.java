package ro.ovidiuconeac.foodtavern.webapp.features.food.business.beans;

import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;
import ro.ovidiuconeac.foodtavern.webapp.features.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webapp.features.food.exceptions.PostException;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesBean {
    Cheese getRandom() throws GetException;
    List<Cheese> getAll() throws GetException;
    boolean addNew(Cheese cheese) throws PostException;
}
