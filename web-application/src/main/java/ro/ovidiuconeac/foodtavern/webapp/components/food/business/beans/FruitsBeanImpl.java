package ro.ovidiuconeac.foodtavern.webapp.components.food.business.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;
import ro.ovidiuconeac.foodtavern.webapp.components.food.business.transformers.FruitsTransformer;
import ro.ovidiuconeac.foodtavern.webapp.components.food.data.dao.FruitsDao;
import ro.ovidiuconeac.foodtavern.webapp.components.food.data.entities.FruitEntity;
import ro.ovidiuconeac.foodtavern.webapp.components.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webapp.components.food.exceptions.PostException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */
@Service
public class FruitsBeanImpl implements FruitsBean {

    private final Random random = new Random();

    private final FruitsDao dao;
    private FruitsTransformer transformer;

    // Better for testing
    @Autowired
    public FruitsBeanImpl(FruitsDao dao, FruitsTransformer transformer) {
        this.dao = dao;
        this.transformer = transformer;
    }

    @Override
    public Fruit getRandom() throws GetException {
        List<FruitEntity> result = new ArrayList<>();
        dao.findAll().forEach(fruitEntity -> {
            result.add(fruitEntity);
        });
        if (result == null || result.isEmpty()) {
            throw new GetException();
        }
        return transformer.getModelFrom(result.get(random.nextInt(result.size() - 1)));
    }

    @Override
    public List<Fruit> getAll() throws GetException {
        List<Fruit> result = new ArrayList<>();
        dao.findAll().forEach(fruitEntity -> {
            result.add(transformer.getModelFrom(fruitEntity));
        });
        if (result == null || result.isEmpty()) {
            throw new GetException();
        }
        return result;
    }

    @Override
    public boolean addNew(Fruit fruit) throws PostException {
        FruitEntity result = dao.save(transformer.getEntityFrom(fruit));
        if (result == null) {
            throw new PostException();
        }
        return true;
    }
}
