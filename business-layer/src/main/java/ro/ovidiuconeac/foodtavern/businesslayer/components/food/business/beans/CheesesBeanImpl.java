package ro.ovidiuconeac.foodtavern.webservice.components.food.business.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.common.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.common.exceptions.PostException;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.webservice.components.food.business.transformers.CheesesTransformer;

import ro.ovidiuconeac.foodtavern.webservice.components.food.data.dao.CheesesDao;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.CheeseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */
@Service
public class CheesesBeanImpl implements CheesesBean {

    private final Random random = new Random();

    private CheesesDao dao;
    private CheesesTransformer transformer;

    // Better for testing
    @Autowired
    public CheesesBeanImpl(CheesesDao dao, CheesesTransformer transformer) {
        this.dao = dao;
        this.transformer = transformer;
    }

    @Override
    public Cheese getRandom() throws GetException {
        List<CheeseEntity> result = new ArrayList<>();
        dao.findAll().forEach(cheeseEntity -> {
            result.add(cheeseEntity);
        });
        if (result == null || result.isEmpty()) {
            throw new GetException();
        }
        return transformer.getModelFrom(result.get(random.nextInt(result.size() - 1)));
    }

    @Override
    public List<Cheese> getAll() throws GetException {
        List<Cheese> result = new ArrayList<>();
        dao.findAll().forEach(cheeseEntity -> {
            result.add(transformer.getModelFrom(cheeseEntity));
        });
        if (result == null || result.isEmpty()) {
            throw new GetException();
        }
        return result;
    }

    @Override
    public boolean addNew(Cheese cheese) throws PostException {
        CheeseEntity result = dao.save(transformer.getEntityFrom(cheese));
        if (result == null) {
            throw new PostException();
        }
        return true;
    }
}
