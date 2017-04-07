package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.exceptions.NoResultException;
import ro.ovidiuconeac.foodtavern.common.exceptions.RequestException;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FoodUseCasesWithNoResultExceptionTest {

    private FoodUseCases foodUseCases;

    @Before
    public void setUp() {
        foodUseCases = mock(FoodUseCases.class);
    }

    @After
    public void tearDown() {
        foodUseCases = null;
    }

    @Test
    public void testGetFruitWithNoResultException() {
        try {
            when(foodUseCases.getFruit(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            foodUseCases.getFruit(any(RestServiceApi.class));
        } catch (RequestException e) {
            assertEquals(true, false);
        } catch (NoResultException e) {
            assertEquals("Data was not found on the server.", e.getMessage());
        }
    }

    @Test(expected = NoResultException.class)
    public void testGetAllFruitsWithNoResultException() throws RequestException, NoResultException {
        when(foodUseCases.getAllFruits(any(RestServiceApi.class)))
                .thenThrow(new NoResultException());
        foodUseCases.getAllFruits(any(RestServiceApi.class));
    }

    @Test(expected = NoResultException.class)
    public void testAddNewFruitWithNoResultException() throws NoResultException, RequestException {
        when(foodUseCases.addNewFruit(any(RestServiceApi.class), any(Fruit.class))).thenThrow(new NoResultException());
        foodUseCases.addNewFruit(any(RestServiceApi.class), any(Fruit.class));
    }

    @Test
    public void testGetCheeseWithNoResultException() {
        try {
            when(foodUseCases.getCheese(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            foodUseCases.getCheese(any(RestServiceApi.class));
        } catch (RequestException e) {
            assertEquals(true, false);
        } catch (NoResultException e) {
            assertEquals("Data was not found on the server.", e.getMessage());
        }
    }

    @Test(expected = NoResultException.class)
    public void testGetAllCheesesWithNoResultException() throws RequestException, NoResultException {
        when(foodUseCases.getAllCheeses(any(RestServiceApi.class)))
                .thenThrow(new NoResultException());
        foodUseCases.getAllCheeses(any(RestServiceApi.class));
    }

    @Test(expected = NoResultException.class)
    public void testAddNewCheeseWithNoResultException() throws NoResultException, RequestException {
        when(foodUseCases.addNewCheese(any(RestServiceApi.class), any(Cheese.class))).thenThrow(new NoResultException());
        foodUseCases.addNewCheese(any(RestServiceApi.class), any(Cheese.class));
    }

    @Test
    public void testGetSweetWithNoResultException() {
        try {
            when(foodUseCases.getSweet(any(RestServiceApi.class)))
                    .thenThrow(new NoResultException());
            foodUseCases.getSweet(any(RestServiceApi.class));
        } catch (RequestException e) {
            assertEquals(true, false);
        } catch (NoResultException e) {
            assertEquals("Data was not found on the server.", e.getMessage());
        }
    }

    @Test(expected = NoResultException.class)
    public void testGetAllSweetsWithNoResultException() throws RequestException, NoResultException {
        when(foodUseCases.getAllSweets(any(RestServiceApi.class)))
                .thenThrow(new NoResultException());
        foodUseCases.getAllSweets(any(RestServiceApi.class));
    }

    @Test(expected = NoResultException.class)
    public void testAddNewSweetWithNoResultException() throws NoResultException, RequestException {
        when(foodUseCases.addNewSweet(any(RestServiceApi.class), any(Sweet.class))).thenThrow(new NoResultException());
        foodUseCases.addNewSweet(any(RestServiceApi.class), any(Sweet.class));
    }
}