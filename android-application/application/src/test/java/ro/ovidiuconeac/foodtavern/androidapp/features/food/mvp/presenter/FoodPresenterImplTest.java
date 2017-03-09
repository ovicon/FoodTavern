package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import ro.ovidiuconeac.foodtavern.androidapp.features.common.Screen;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.rest.RestServiceApi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FoodPresenterImplTest {

    private RestServiceApi restServiceApi;
    private FoodPresenterImpl presenter;
    private Screen screen;

    @Before
    public void setUp() {
        restServiceApi = mock(RestServiceApi.class);
        presenter = mock(FoodPresenterImpl.class);
        screen = mock(Screen.class);
    }

    @After
    public void tearDown() {
        restServiceApi = null;
        presenter = null;
        screen = null;
    }

    @Test
    public void testGetCheese() {
        doNothing().when(presenter).requestCheese(any(RestServiceApi.class));
        presenter.requestCheese(restServiceApi);
    }

    @Test
    public void testGetAllCheeses() {
        doNothing().when(presenter).requestAllCheeses(any(RestServiceApi.class));
        presenter.requestAllCheeses(restServiceApi);
    }

    @Test
    public void testGetFruit() {
        doNothing().when(presenter).requestFruit(any(RestServiceApi.class));
        presenter.requestFruit(restServiceApi);
    }

    @Test
    public void testGetAllFruits() {
        doNothing().when(presenter).requestAllFruits(any(RestServiceApi.class));
        presenter.requestAllFruits(restServiceApi);
    }

    @Test
    public void testGetSweet() {
        doNothing().when(presenter).requestSweet(any(RestServiceApi.class));
        presenter.requestSweet(restServiceApi);
    }

    @Test
    public void testGetAllSweets() {
        doNothing().when(presenter).requestAllSweets(any(RestServiceApi.class));
        presenter.requestAllSweets(restServiceApi);
    }

    @Test
    public void testSetScreen() {
        doNothing().when(presenter).setScreen(any(Screen.class));
        presenter.setScreen(screen);
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