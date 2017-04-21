package ro.ovidiuconeac.foodtavern.webservice.components.food.data.transformers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.CheeseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class CheesesTransformerTest {

    private CheesesTransformer transformer;
    private CheeseEntity entity;
    private Cheese model;

    @Before
    public void setUp() {
        transformer = new CheesesTransformer();
        entity = new CheeseEntity();
        entity.setId(1L);
        entity.setName("Cas");
        model = new Cheese("Cas");
    }

    @After
    public void tearDown() {
        transformer = null;
        entity = null;
        model = null;
    }

    @Test
    public void testTransformEntityToModel() {
        Cheese result = transformer.getModelFrom(entity);
        assertNotNull(result);
        assertEquals("Cas", result.getName());
    }

    @Test
    public void testTransformModelToEntity() {
        CheeseEntity result = transformer.getEntityFrom(model);
        assertNotNull(result);
        assertEquals("Cas", result.getName());
    }
}