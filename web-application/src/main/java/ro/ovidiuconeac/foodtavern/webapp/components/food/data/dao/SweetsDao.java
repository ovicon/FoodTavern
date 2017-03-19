package ro.ovidiuconeac.foodtavern.webapp.components.food.data.dao;

import org.springframework.data.repository.CrudRepository;
import ro.ovidiuconeac.foodtavern.webapp.components.food.data.entities.SweetEntity;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface SweetsDao extends CrudRepository<SweetEntity, Long> {
    // Methods implemented by framework
}
