package ro.ovidiuconeac.foodtavern.businesslayer.components.food.business.transformers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.apilayer.components.food.data.entities.FruitEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class FruitTransformerTest {

    private FruitsTransformer transformer;
    private FruitEntity entity;
    private Fruit model;

    @Before
    public void setUp() {
        transformer = new FruitsTransformer();
        entity = new FruitEntity();
        entity.setId(1L);
        entity.setName("Cherry");
        model = new Fruit("Cherry");
    }

    @After
    public void tearDown() {
        transformer = null;
    }

    @Test
    public void testTransformEntityToModel() {
        Fruit result = transformer.getModelFrom(entity);
        assertNotNull(result);
        assertEquals("Cherry", result.getName());
    }

    @Test
    public void testTransformModelToEntity() {
        FruitEntity result = transformer.getEntityFrom(model);
        assertNotNull(result);
        Assert.assertEquals("Cherry", result.getName());
    }
}