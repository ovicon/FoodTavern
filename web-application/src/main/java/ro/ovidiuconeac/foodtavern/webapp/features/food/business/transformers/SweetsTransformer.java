package ro.ovidiuconeac.foodtavern.webapp.features.food.business.transformers;

import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.models.features.food.Sweet;
import ro.ovidiuconeac.foodtavern.webapp.features.food.data.entities.SweetEntity;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
@Service
public class SweetsTransformer {

    public Sweet getModelFrom(SweetEntity sweetEntity) {
        Sweet sweet = new Sweet();
        sweet.setName(sweetEntity.getName());
        return sweet;
    }

    public SweetEntity getEntityFrom(Sweet sweet) {
        SweetEntity sweetEntity = new SweetEntity();
        sweetEntity.setName(sweet.getName());
        return sweetEntity;
    }
}