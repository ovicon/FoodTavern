package ro.ovidiuconeac.foodtavern.webapp.features.food.data.dao;

import org.springframework.data.repository.CrudRepository;
import ro.ovidiuconeac.foodtavern.webapp.features.food.data.entities.CheeseEntity;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesDao extends CrudRepository<CheeseEntity, Long> {
    // Methods implemented by framework
}
