package ro.ovidiuconeac.foodtavern.businesslayer.components.food.business.beans;

import ro.ovidiuconeac.foodtavern.common.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.common.exceptions.PostException;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsBean {
    Sweet getRandom() throws GetException;
    List<Sweet> getAll() throws GetException;
    boolean addNew(Sweet sweet) throws PostException;
}