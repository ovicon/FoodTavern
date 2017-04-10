package ro.ovidiuconeac.foodtavern.webservice.components.food.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.FruitEntity;

/**
 * Created by ovidiu on 2/7/17.
 */
@Repository
public interface FruitsDao extends CrudRepository<FruitEntity, Long> {
    // Methods implemented by framework
}
