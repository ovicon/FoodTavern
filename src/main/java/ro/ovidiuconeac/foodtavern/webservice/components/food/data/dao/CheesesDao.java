package ro.ovidiuconeac.foodtavern.webservice.components.food.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.CheeseEntity;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesDao extends CrudRepository<CheeseEntity, Long> {
    // Methods implemented by framework
}
