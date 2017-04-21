package ro.ovidiuconeac.foodtavern.webservice.components.food.business.beans;

import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.PostException;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesBean {
    Cheese getRandom() throws GetException;
    List<Cheese> getAll() throws GetException;
    boolean addNew(Cheese cheese) throws PostException;
}
