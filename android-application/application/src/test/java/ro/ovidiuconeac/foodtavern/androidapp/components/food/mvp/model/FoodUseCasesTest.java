package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import ro.ovidiuconeac.foodtavern.androidapp.components.food.exceptions.NoResultException;
import ro.ovidiuconeac.foodtavern.androidapp.components.food.exceptions.RequestException;
import ro.ovidiuconeac.foodtavern.androidapp.components.food.rest.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FoodUseCasesTest {

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
    public void testGetFruit() {
        try {
            Fruit fruit = new Fruit("Banana");
            when(foodUseCases.getFruit(any(RestServiceApi.class))).thenReturn(fruit);
            Fruit result = foodUseCases.getFruit(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Banana", fruit.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetAllFruits() {
        try {
            Fruit fruit = new Fruit("Cherries");
            List<Fruit> fruits = new ArrayList<>(1);
            fruits.add(fruit);
            when(foodUseCases.getAllFruits(any(RestServiceApi.class))).thenReturn(fruits);
            List<Fruit> result = foodUseCases.getAllFruits(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Cherries", fruits.get(0).getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testAddNewFruit() {
        try {
            when(foodUseCases.addNewFruit(any(RestServiceApi.class), any(Fruit.class))).thenReturn(true);
            boolean result = foodUseCases.addNewFruit(any(RestServiceApi.class), any(Fruit.class));
            assertEquals(true, result);
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetCheese() {
        try {
            Cheese cheese = new Cheese("Telemea");
            when(foodUseCases.getCheese(any(RestServiceApi.class))).thenReturn(cheese);
            Cheese result = foodUseCases.getCheese(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Telemea", cheese.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetAllCheeses() {
        try {
            Cheese cheese = new Cheese("Cas");
            List<Cheese> cheeses = new ArrayList<>(1);
            cheeses.add(cheese);
            when(foodUseCases.getAllCheeses(any(RestServiceApi.class))).thenReturn(cheeses);
            List<Cheese> result = foodUseCases.getAllCheeses(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Cas", cheeses.get(0).getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testAddNewCheese() {
        try {
            when(foodUseCases.addNewCheese(any(RestServiceApi.class), any(Cheese.class))).thenReturn(true);
            boolean result = foodUseCases.addNewCheese(any(RestServiceApi.class), any(Cheese.class));
            assertEquals(true, result);
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetSweet() {
        try {
            Sweet sweet = new Sweet("Dobos");
            when(foodUseCases.getSweet(any(RestServiceApi.class))).thenReturn(sweet);
            Sweet result = foodUseCases.getSweet(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Dobos", sweet.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testGetAllSweets() {
        try {
            Sweet sweet = new Sweet("Cremes");
            List<Sweet> sweets = new ArrayList<>(1);
            sweets.add(sweet);
            when(foodUseCases.getAllSweets(any(RestServiceApi.class))).thenReturn(sweets);
            List<Sweet> result = foodUseCases.getAllSweets(any(RestServiceApi.class));
            assertNotNull(result);
            assertEquals("Cremes", sweet.getName());
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }

    @Test
    public void testAddNewSweet() {
        try {
            when(foodUseCases.addNewSweet(any(RestServiceApi.class), any(Sweet.class))).thenReturn(true);
            boolean result = foodUseCases.addNewSweet(any(RestServiceApi.class), any(Sweet.class));
            assertEquals(true, result);
        } catch (RequestException | NoResultException e) {
            // Force fail
            assertEquals(true, false);
        }
    }
}