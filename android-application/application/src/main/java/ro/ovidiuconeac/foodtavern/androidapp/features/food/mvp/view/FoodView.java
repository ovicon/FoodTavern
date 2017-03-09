package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view;

import ro.ovidiuconeac.foodtavern.androidapp.features.common.Screen;

/**
 * Created by ovidiu on 2/6/17.
 */

public interface FoodView extends Screen {
    // Fruit
    void requestFruit();
    void postFruit(String fruit);
    void enableUiFruit(boolean enable);
    void requestAllFruits();
    void postAllFruits(String[] fruits);
    void postFruitRequestError(String msg);
    void requestAddNewFruit();
    // Cheese
    void requestCheese();
    void postCheese(String cheese);
    void requestAllCheeses();
    void postAllCheeses(String[] cheeses);
    void postCheeseRequestError(String msg);
    void requestAddNewCheese();
    // Sweet
    void requestSweet();
    void postSweet(String sweet);
    void requestAllSweets();
    void postAllSweets(String[] sweets);
    void postSweetRequestError(String msg);
    void requestAddNewSweet();
}
