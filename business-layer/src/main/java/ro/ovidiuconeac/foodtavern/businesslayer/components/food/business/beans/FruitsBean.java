package ro.ovidiuconeac.foodtavern.businesslayer.components.food.business.beans;

import ro.ovidiuconeac.foodtavern.common.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.common.exceptions.PostException;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsBean {
    Fruit getRandom() throws GetException;
    List<Fruit> getAll() throws GetException;
    boolean addNew(Fruit fruit) throws PostException;
}
