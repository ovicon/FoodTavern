package ro.ovidiuconeac.foodtavern.webservice.components.food.data.transformers;

import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.CheeseEntity;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
@Service
public class CheesesTransformer {

    public Cheese getModelFrom(CheeseEntity cheeseEntity) {
        Cheese cheese = new Cheese(cheeseEntity.getName());
        return cheese;
    }

    public CheeseEntity getEntityFrom(Cheese cheese) {
        CheeseEntity cheeseEntity = new CheeseEntity();
        cheeseEntity.setName(cheese.getName());
        return cheeseEntity;
    }
}
