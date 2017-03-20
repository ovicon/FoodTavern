package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.view.FoodViewImpl;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by www.ovidiuconeac.ro on 3/11/17.
 */

public class FoodActivityTest {

    private FoodViewImpl foodView;

    @Before
    public void setUp() {
        foodView = mock(FoodViewImpl.class);
    }

    @After
    public void tearDown() {
        foodView = null;
    }

    @Test
    public void testRequestFruit() {
        doNothing().when(foodView).requestFruit();
        foodView.requestFruit();
    }

    @Test
    public void testPostFruit() {
        doNothing().when(foodView).postFruit(any());
        foodView.postFruit(any());
    }

    @Test
    public void testRequestAllFruits() {
        doNothing().when(foodView).requestAllFruits();
        foodView.requestAllFruits();
    }
    
    @Test
    public void testPostAllFruits() {
        doNothing().when(foodView).postAllFruits(any());
        foodView.postAllFruits(any());
    }
    
    @Test
    public void postFruitRequestError() {
        doNothing().when(foodView).postFruitRequestError(any());
        foodView.postFruitRequestError(any());
    }

    @Test
    public void testRequestAddNewFruit() {
        doNothing().when(foodView).requestAddNewFruit(any());
        foodView.requestAddNewFruit(any());
    }

    @Test
    public void testPostAddNewFruitRequestSuccess() {
        doNothing().when(foodView).postAddNewFruitRequestSuccess(any());
        foodView.postAddNewFruitRequestSuccess(any());
    }

    @Test
    public void testRequestCheese() {
        doNothing().when(foodView).requestCheese();
        foodView.requestCheese();
    }

    @Test
    public void testPostCheese() {
        doNothing().when(foodView).postCheese(any());
        foodView.postCheese(any());
    }

    @Test
    public void testRequestAllCheeses() {
        doNothing().when(foodView).requestAllCheeses();
        foodView.requestAllCheeses();
    }

    @Test
    public void testPostAllCheeses() {
        doNothing().when(foodView).postAllCheeses(any());
        foodView.postAllCheeses(any());
    }

    @Test
    public void testPostCheeseRequestError() {
        doNothing().when(foodView).postCheeseRequestError(any());
        foodView.postCheeseRequestError(any());
    }

    @Test
    public void testRequestAddNewCheese() {
        doNothing().when(foodView).requestAddNewCheese(any());
        foodView.requestAddNewCheese(any());
    }

    @Test
    public void testPostAddNewCheeseRequestSuccess() {
        doNothing().when(foodView).postAddNewCheeseRequestSuccess(any());
        foodView.postAddNewCheeseRequestSuccess(any());
    }

    @Test
    public void testRequestSweet() {
        doNothing().when(foodView).requestSweet();
        foodView.requestSweet();
    }

    @Test
    public void testPostSweet() {
        doNothing().when(foodView).postSweet(any());
        foodView.postSweet(any());
    }

    @Test
    public void testRequestAllSweets() {
        doNothing().when(foodView).requestAllSweets();
        foodView.requestAllSweets();
    }

    @Test
    public void testPostAllSweets() {
        doNothing().when(foodView).postAllSweets(any());
        foodView.postAllSweets(any());
    }

    @Test
    public void testPostSweetRequestError() {
        doNothing().when(foodView).postSweetRequestError(any());
        foodView.postSweetRequestError(any());
    }

    @Test
    public void testRequestAddNewSweet() {
        doNothing().when(foodView).requestAddNewSweet(any());
        foodView.requestAddNewSweet(any());
    }

    @Test
    public void testPostAddNewSweetRequestSuccess() {
        doNothing().when(foodView).postAddNewSweetRequestSuccess(any());
        foodView.postAddNewSweetRequestSuccess(any());
    }
}
