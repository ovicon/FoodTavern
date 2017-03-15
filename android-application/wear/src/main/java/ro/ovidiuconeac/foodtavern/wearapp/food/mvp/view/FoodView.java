package ro.ovidiuconeac.foodtavern.wearapp.food.mvp.view;

import ro.ovidiuconeac.foodtavern.androidapp.features.common.Screen;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 */

public interface FoodView extends Screen {
    // Fruit
    void requestFruit();
    void postFruit(String fruit);
    void requestAllFruits();
    void postAllFruits(String[] fruits);
    void postFruitRequestError(String msg);
    void requestAddNewFruit(Fruit fruit);
    void postAddNewFruitRequestSuccess(String msg);
    // Cheese
    void requestCheese();
    void postCheese(String cheese);
    void requestAllCheeses();
    void postAllCheeses(String[] cheeses);
    void postCheeseRequestError(String msg);
    void requestAddNewCheese(Cheese cheese);
    void postAddNewCheeseRequestSuccess(String msg);
    // Sweet
    void requestSweet();
    void postSweet(String sweet);
    void requestAllSweets();
    void postAllSweets(String[] sweets);
    void postSweetRequestError(String msg);
    void requestAddNewSweet(Sweet sweet);
    void postAddNewSweetRequestSuccess(String msg);
}
