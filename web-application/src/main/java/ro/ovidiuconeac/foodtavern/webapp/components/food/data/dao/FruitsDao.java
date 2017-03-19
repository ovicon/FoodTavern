package ro.ovidiuconeac.foodtavern.webapp.components.food.data.dao;

import org.springframework.data.repository.CrudRepository;
import ro.ovidiuconeac.foodtavern.webapp.components.food.data.entities.FruitEntity;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsDao extends CrudRepository<FruitEntity, Long> {
    // Methods implemented by framework
}
