package ro.ovidiuconeac.foodtavern.webapp.features.food.business.beans;

import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;
import ro.ovidiuconeac.foodtavern.webapp.features.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webapp.features.food.exceptions.PostException;

import java.util.List;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsBean {
    Fruit getRandom() throws GetException;
    List<Fruit> getAll() throws GetException;
    boolean addNew(Fruit fruit) throws PostException;
}
