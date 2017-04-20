package ro.ovidiuconeac.foodtavern.businesslayer.components.food.business.beans;

import ro.ovidiuconeac.foodtavern.common.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.common.exceptions.PostException;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesBean {
    Cheese getRandom() throws GetException;
    List<Cheese> getAll() throws GetException;
    boolean addNew(Cheese cheese) throws PostException;
}
