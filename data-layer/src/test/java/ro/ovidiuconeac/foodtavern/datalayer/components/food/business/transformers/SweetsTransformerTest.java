package ro.ovidiuconeac.foodtavern.datalayer.components.food.business.transformers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.foodtavern.apilayer.components.food.data.entities.SweetEntity;
import ro.ovidiuconeac.foodtavern.apilayer.components.food.data.transformers.SweetsTransformer;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class SweetsTransformerTest {

    private SweetsTransformer transformer;
    private SweetEntity entity;
    private Sweet model;

    @Before
    public void setUp() {
        transformer = new SweetsTransformer();
        entity = new SweetEntity();
        entity.setId(1L);
        entity.setName("Amandina");
        model = new Sweet("Amandina");
    }

    @After
    public void tearDown() {
        transformer = null;
    }

    @Test
    public void testTransformEntityToModel() {
        Sweet result = transformer.getModelFrom(entity);
        assertNotNull(result);
        assertEquals("Amandina", result.getName());
    }

    @Test
    public void testTransformModelToEntity() {
        SweetEntity result = transformer.getEntityFrom(model);
        assertNotNull(result);
        Assert.assertEquals("Amandina", result.getName());
    }
}