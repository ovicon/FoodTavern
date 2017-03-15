package ro.ovidiuconeac.foodtavern.webapp.features.food.business.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;
import ro.ovidiuconeac.foodtavern.webapp.features.food.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.webapp.features.food.exceptions.PostException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class CheeseBeanImplTest {

    @Mock
    private CheesesBean bean;

    @Test
    public void testGetRandom() {
        try {
            Cheese cheese = new Cheese("Telemea");
            when(bean.getRandom()).thenReturn(cheese);
            Cheese result = bean.getRandom();
            assertNotNull(result);
            assertEquals("Telemea", result.getName());
        } catch (GetException e) {
            assertEquals(true, false);
        }
    }

    @Test(expected = GetException.class)
    public void testGetRandomWithGetException1() throws GetException {
        when(bean.getRandom()).thenThrow(new GetException());
        bean.getRandom();
    }

    @Test
    public void testGetRandomWithGetException2() {
        try {
            Mockito.when(bean.getRandom()).thenThrow(new GetException());
            bean.getRandom();
        } catch (GetException e) {
            assertEquals("No result found in database.", e.getMessage());
        }
    }

    @Test
    public void testGetAll() {
        try {
            Cheese cheese = new Cheese("Cas");
            List<Cheese> cheeses = new ArrayList<>();
            cheeses.add(cheese);
            when(bean.getAll()).thenReturn(cheeses);
            List<Cheese> result = bean.getAll();
            assertNotNull(result);
            assertEquals(cheeses, result);
            assertEquals(cheeses.get(0), result.get(0));
        } catch (GetException e) {
            assertEquals(true, false);
        }
    }

    @Test(expected = GetException.class)
    public void testGetAllWithGetException1() throws GetException {
        when(bean.getAll()).thenThrow(new GetException());
        bean.getAll();
    }

    @Test
    public void testGetAllWithGetException2() {
        try {
            when(bean.getAll()).thenThrow(new GetException());
            bean.getAll();
        } catch (GetException e) {
            assertEquals("No result found in database.", e.getMessage());
        }
    }

    @Test
    public void testAddNew() {
        try {
            when(bean.addNew(any(Cheese.class))).thenReturn(true);
            boolean result = bean.addNew(new Cheese(""));
            assertEquals(true, result);
        } catch (PostException e) {
            assertEquals(true, false);
        }
    }

    @Test(expected = PostException.class)
    public void testAddNewWithPostException1() throws PostException {
        when(bean.addNew(any(Cheese.class))).thenThrow(new PostException());
        bean.addNew(new Cheese(""));
    }

    @Test
    public void testAddNewWithPostException2() {
        try {
            when(bean.addNew(any(Cheese.class))).thenThrow(new PostException());
            bean.addNew(new Cheese(""));
        } catch (PostException e) {
            assertEquals("Unable to add food to database.", e.getMessage());
        }
    }
}