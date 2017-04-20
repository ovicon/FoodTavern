package ro.ovidiuconeac.foodtavern.businesslayer.components.food.business.transformers;

import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.apilayer.components.food.data.entities.FruitEntity;

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
