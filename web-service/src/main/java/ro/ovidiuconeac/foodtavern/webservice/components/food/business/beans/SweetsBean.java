package ro.ovidiuconeac.foodtavern.webservice.components.food.business.beans;

import ro.ovidiuconeac.foodtavern.common.models.Sweet;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.PostException;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsBean {
    Sweet getRandom() throws GetException;
    List<Sweet> getAll() throws GetException;
    boolean addNew(Sweet sweet) throws PostException;
}