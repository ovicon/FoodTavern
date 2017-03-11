package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by www.ovidiuconeac.ro on 3/11/17.
 */

public class FoodActivityTest {

    private FoodActivity foodActivity;

    @Before
    public void setUp() {
        foodActivity = mock(FoodActivity.class);
    }

    @After
    public void tearDown() {
        foodActivity = null;
    }

    @Test
    public void testRequestFruit() {
        doNothing().when(foodActivity).requestFruit();
        foodActivity.requestFruit();
    }

    @Test
    public void testPostFruit() {
        doNothing().when(foodActivity).postFruit(any());
        foodActivity.postFruit(any());
    }

    @Test
    public void testRequestAllFruits() {
        doNothing().when(foodActivity).requestAllFruits();
        foodActivity.requestAllFruits();
    }
    
    @Test
    public void testPostAllFruits() {
        doNothing().when(foodActivity).postAllFruits(any());
        foodActivity.postAllFruits(any());
    }
    
    @Test
    public void postFruitRequestError() {
        doNothing().when(foodActivity).postFruitRequestError(any());
        foodActivity.postFruitRequestError(any());
    }

    @Test
    public void testRequestAddNewFruit() {
        doNothing().when(foodActivity).requestAddNewFruit(any());
        foodActivity.requestAddNewFruit(any());
    }

    @Test
    public void testPostAddNewFruitRequestSuccess() {
        doNothing().when(foodActivity).postAddNewFruitRequestSuccess(any());
        foodActivity.postAddNewFruitRequestSuccess(any());
    }

    @Test
    public void testRequestCheese() {
        doNothing().when(foodActivity).requestCheese();
        foodActivity.requestCheese();
    }

    @Test
    public void testPostCheese() {
        doNothing().when(foodActivity).postCheese(any());
        foodActivity.postCheese(any());
    }

    @Test
    public void testRequestAllCheeses() {
        doNothing().when(foodActivity).requestAllCheeses();
        foodActivity.requestAllCheeses();
    }

    @Test
    public void testPostAllCheeses() {
        doNothing().when(foodActivity).postAllCheeses(any());
        foodActivity.postAllCheeses(any());
    }

    @Test
    public void testPostCheeseRequestError() {
        doNothing().when(foodActivity).postCheeseRequestError(any());
        foodActivity.postCheeseRequestError(any());
    }

    @Test
    public void testRequestAddNewCheese() {
        doNothing().when(foodActivity).requestAddNewCheese(any());
        foodActivity.requestAddNewCheese(any());
    }

    @Test
    public void testPostAddNewCheeseRequestSuccess() {
        doNothing().when(foodActivity).postAddNewCheeseRequestSuccess(any());
        foodActivity.postAddNewCheeseRequestSuccess(any());
    }

    @Test
    public void testRequestSweet() {
        doNothing().when(foodActivity).requestSweet();
        foodActivity.requestSweet();
    }

    @Test
    public void testPostSweet() {
        doNothing().when(foodActivity).postSweet(any());
        foodActivity.postSweet(any());
    }

    @Test
    public void testRequestAllSweets() {
        doNothing().when(foodActivity).requestAllSweets();
        foodActivity.requestAllSweets();
    }

    @Test
    public void testPostAllSweets() {
        doNothing().when(foodActivity).postAllSweets(any());
        foodActivity.postAllSweets(any());
    }

    @Test
    public void testPostSweetRequestError() {
        doNothing().when(foodActivity).postSweetRequestError(any());
        foodActivity.postSweetRequestError(any());
    }

    @Test
    public void testRequestAddNewSweet() {
        doNothing().when(foodActivity).requestAddNewSweet(any());
        foodActivity.requestAddNewSweet(any());
    }

    @Test
    public void testPostAddNewSweetRequestSuccess() {
        doNothing().when(foodActivity).postAddNewSweetRequestSuccess(any());
        foodActivity.postAddNewSweetRequestSuccess(any());
    }
}
