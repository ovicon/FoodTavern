package ro.ovidiuconeac.foodtavern.webservice.components.food.business.transformers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.foodtavern.models.features.food.Sweet;
import ro.ovidiuconeac.foodtavern.webservice.components.food.data.entities.SweetEntity;

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
        assertEquals("Amandina", result.getName());
    }
}