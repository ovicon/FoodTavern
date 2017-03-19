package ro.ovidiuconeac.foodtavern.webapp.components.food.business.beans;

import ro.ovidiuconeac.foodtavern.models.features.food.Sweet;
import ro.ovidiuconeac.foodtavern.webapp.components.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webapp.components.food.exceptions.PostException;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsBean {
    Sweet getRandom() throws GetException;
    List<Sweet> getAll() throws GetException;
    boolean addNew(Sweet sweet) throws PostException;
}