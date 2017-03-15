package ro.ovidiuconeac.foodtavern.webapp.features.food.business.transformers;

import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;
import ro.ovidiuconeac.foodtavern.webapp.features.food.data.entities.FruitEntity;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
@Service
public class FruitsTransformer {

    public Fruit getModelFrom(FruitEntity fruitEntity) {
        Fruit fruit = new Fruit(fruitEntity.getName());
        return fruit;
    }

    public FruitEntity getEntityFrom(Fruit fruit) {
        FruitEntity fruitEntity = new FruitEntity();
        fruitEntity.setName(fruit.getName());
        return fruitEntity;
    }
}
