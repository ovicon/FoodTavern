package ro.ovidiuconeac.foodtavern.webservice.components.food.business.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;
import ro.ovidiuconeac.foodtavern.webservice.components.food.business.transformers.SweetsTransformer;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.dao.SweetsDao;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.SweetEntity;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webservice.components.food.exceptions.PostException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */
@Service
public class SweetsBeanImpl implements SweetsBean {

    private final Random random = new Random();

    private final SweetsDao dao;
    private SweetsTransformer transformer;

    // Better for testing
    @Autowired
    public SweetsBeanImpl(SweetsDao dao) {
        this.dao = dao;
        this.transformer = new SweetsTransformer();
    }

    @Override
    public Sweet getRandom() throws GetException {
        List<SweetEntity> result = new ArrayList<>();
        dao.findAll().forEach(sweetEntity -> {
            result.add(sweetEntity);
        });
        if (result == null || result.isEmpty()) {
            throw new GetException();
        }
        return transformer.getModelFrom(result.get(random.nextInt(result.size() - 1)));
    }

    @Override
    public List<Sweet> getAll() throws GetException {
        List<Sweet> result = new ArrayList<>();
        dao.findAll().forEach(SweetEntity -> {
            result.add(transformer.getModelFrom(SweetEntity));
        });
        if (result == null || result.isEmpty()) {
            throw new GetException();
        }
        return result;
    }

    @Override
    public boolean addNew(Sweet Sweet) throws PostException {
        SweetEntity result = dao.save(transformer.getEntityFrom(Sweet));
        if (result == null) {
            throw new PostException();
        }
        return true;
    }
}
