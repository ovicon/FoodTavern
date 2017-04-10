package ro.ovidiuconeac.foodtavern.webservice.components.food.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.SweetEntity;

/**
 * Created by ovidiu on 2/7/17.
 */
@Repository
public interface SweetsDao extends CrudRepository<SweetEntity, Long> {
    // Methods implemented by framework
}
