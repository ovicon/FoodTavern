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

public class FoodUseCasesWithRequestExceptionTest {

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
    public void testGetFruitWithRequestException() {
        try {
            when(foodUseCases.getFruit(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getFruit(any(RestServiceApi.class));
        } catch (RequestException e) {
            assertEquals("Unable to contact server.", e.getMessage());
        } catch (NoResultException e) {
            assertEquals(true, false);
        }
    }

    @Test(expected = RequestException.class)
    public void testGetAllFruitsWithRequestException() throws RequestException, NoResultException {
        when(foodUseCases.getAllFruits(any(RestServiceApi.class)))
                .thenThrow(new RequestException());
        foodUseCases.getAllFruits(any(RestServiceApi.class));
    }

    @Test(expected = RequestException.class)
    public void testAddNewFruitWithNoResultException() throws NoResultException, RequestException {
        when(foodUseCases.addNewFruit(any(RestServiceApi.class), any(Fruit.class))).thenThrow(new RequestException());
        foodUseCases.addNewFruit(any(RestServiceApi.class), any(Fruit.class));
    }

    @Test
    public void testGetCheeseWithRequestException() {
        try {
            when(foodUseCases.getCheese(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getCheese(any(RestServiceApi.class));
        } catch (RequestException e) {
            assertEquals("Unable to contact server.", e.getMessage());
        } catch (NoResultException e) {
            assertEquals(true, false);
        }
    }

    @Test(expected = RequestException.class)
    public void testGetAllCheesesWithRequestException() throws RequestException, NoResultException {
        when(foodUseCases.getAllCheeses(any(RestServiceApi.class)))
                .thenThrow(new RequestException());
        foodUseCases.getAllCheeses(any(RestServiceApi.class));
    }

    @Test(expected = RequestException.class)
    public void testAddNewCheeseWithNoResultException() throws NoResultException, RequestException {
        when(foodUseCases.addNewCheese(any(RestServiceApi.class), any(Cheese.class))).thenThrow(new RequestException());
        foodUseCases.addNewCheese(any(RestServiceApi.class), any(Cheese.class));
    }

    @Test
    public void testGetSweetWithRequestException() {
        try {
            when(foodUseCases.getSweet(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getSweet(any(RestServiceApi.class));
        } catch (RequestException e) {
            assertEquals("Unable to contact server.", e.getMessage());
        } catch (NoResultException e) {
            assertEquals(true, false);
        }
    }

    @Test(expected = RequestException.class)
    public void testGetAllSweetsWithRequestException() throws RequestException, NoResultException {
        when(foodUseCases.getAllSweets(any(RestServiceApi.class)))
                .thenThrow(new RequestException());
        foodUseCases.getAllSweets(any(RestServiceApi.class));
    }

    @Test(expected = RequestException.class)
    public void testAddNewSweetWithNoResultException() throws NoResultException, RequestException {
        when(foodUseCases.addNewSweet(any(RestServiceApi.class), any(Sweet.class))).thenThrow(new RequestException());
        foodUseCases.addNewSweet(any(RestServiceApi.class), any(Sweet.class));
    }

}