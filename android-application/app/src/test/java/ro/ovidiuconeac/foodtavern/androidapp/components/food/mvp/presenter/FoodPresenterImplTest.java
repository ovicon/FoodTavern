package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.foodtavern.androidapp.components.common.Screen;
import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FoodPresenterImplTest {

    private FoodPresenterImpl presenter;

    @Before
    public void setUp() {
        presenter = mock(FoodPresenterImpl.class);
    }

    @After
    public void tearDown() {
        presenter = null;
    }

    @Test
    public void testGetCheese() {
        doNothing().when(presenter).requestCheese(any(RestServiceApi.class));
        presenter.requestCheese(any(RestServiceApi.class));
    }

    @Test
    public void testGetAllCheeses() {
        doNothing().when(presenter).requestAllCheeses(any(RestServiceApi.class));
        presenter.requestAllCheeses(any(RestServiceApi.class));
    }

    @Test
    public void testAddNewCheese() {
        doNothing().when(presenter).requestAddNewCheese(any(RestServiceApi.class), any(Cheese.class));
        presenter.requestAddNewCheese(any(RestServiceApi.class), any(Cheese.class));
    }

    @Test
    public void testGetFruit() {
        doNothing().when(presenter).requestFruit(any(RestServiceApi.class));
        presenter.requestFruit(any(RestServiceApi.class));
    }

    @Test
    public void testGetAllFruits() {
        doNothing().when(presenter).requestAllFruits(any(RestServiceApi.class));
        presenter.requestAllFruits(any(RestServiceApi.class));
    }

    @Test
    public void testAddNewFruit() {
        doNothing().when(presenter).requestAddNewFruit(any(RestServiceApi.class), any(Fruit.class));
        presenter.requestAddNewFruit(any(RestServiceApi.class), any(Fruit.class));
    }

    @Test
    public void testGetSweet() {
        doNothing().when(presenter).requestSweet(any(RestServiceApi.class));
        presenter.requestSweet(any(RestServiceApi.class));
    }

    @Test
    public void testGetAllSweets() {
        doNothing().when(presenter).requestAllSweets(any(RestServiceApi.class));
        presenter.requestAllSweets(any(RestServiceApi.class));
    }

    @Test
    public void testAddNewSweet() {
        doNothing().when(presenter).requestAddNewSweet(any(RestServiceApi.class), any(Sweet.class));
        presenter.requestAddNewSweet(any(RestServiceApi.class), any(Sweet.class));
    }

    @Test
    public void testSetScreen() {
        doNothing().when(presenter).setScreen(any(Screen.class));
        presenter.setScreen(any(Screen.class));
    }

    @Test
    public void testGetUuid() {
        UUID uuid = UUID.randomUUID();
        when(presenter.getUuid()).thenReturn(uuid);
        UUID result = presenter.getUuid();
        assertNotNull(result);
        assertEquals(uuid, result);
    }
}