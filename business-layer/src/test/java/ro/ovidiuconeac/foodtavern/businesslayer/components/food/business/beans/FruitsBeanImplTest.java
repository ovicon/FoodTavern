package ro.ovidiuconeac.foodtavern.businesslayer.components.food.business.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import ro.ovidiuconeac.foodtavern.common.exceptions.GetException;
import ro.ovidiuconeac.foodtavern.common.exceptions.PostException;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;

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
public class FruitsBeanImplTest {
    
    @Mock
    private FruitsBean bean;

    @Test
    public void testGetRandom() {
        try {
            Fruit fruit = new Fruit("Mar");
            when(bean.getRandom()).thenReturn(fruit);
            Fruit result = bean.getRandom();
            assertNotNull(result);
            assertEquals("Mar", result.getName());
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
            Fruit fruit = new Fruit("Banana");
            List<Fruit> fruits = new ArrayList<>();
            fruits.add(fruit);
            when(bean.getAll()).thenReturn(fruits);
            List<Fruit> result = bean.getAll();
            assertNotNull(result);
            assertEquals(fruits, result);
            assertEquals(fruits.get(0), result.get(0));
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
            when(bean.addNew(any(Fruit.class))).thenReturn(true);
            boolean result = bean.addNew(new Fruit(""));
            assertEquals(true, result);
        } catch (PostException e) {
            assertEquals(true, false);
        }
    }

    @Test(expected = PostException.class)
    public void testAddNewWithPostException1() throws PostException {
        when(bean.addNew(any(Fruit.class))).thenThrow(new PostException());
        bean.addNew(new Fruit(""));
    }

    @Test
    public void testAddNewWithPostException2() {
        try {
            when(bean.addNew(any(Fruit.class))).thenThrow(new PostException());
            bean.addNew(new Fruit(""));
        } catch (PostException e) {
            assertEquals("Unable to add food to database.", e.getMessage());
        }
    }
}