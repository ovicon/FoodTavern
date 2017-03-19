package ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.view;

import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;
import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;
import ro.ovidiuconeac.foodtavern.models.features.food.Sweet;

/**
 * Created by ovidiu on 2/24/17.
 */
public interface FoodView {
    // Fruit
    void requestFruit();
    void postFruit(String fruit);
    void requestAllFruits();
    void postAllFruits(String[] fruits);
    void postFruitRequestError(String msg);
    void postAllFruitsRequestError(String msg);
    void requestAddNewFruit(Fruit fruit);
    void postAddNewFruitRequestSuccess(String msg);
    // Cheese
    void requestCheese();
    void postCheese(String cheese);
    void requestAllCheeses();
    void postAllCheeses(String[] cheeses);
    void postCheeseRequestError(String msg);
    void postAllCheesesRequestError(String msg);
    void requestAddNewCheese(Cheese cheese);
    void postAddNewCheeseRequestSuccess(String msg);
    // Sweet
    void requestSweet();
    void postSweet(String sweet);
    void requestAllSweets();
    void postAllSweets(String[] sweets);
    void postSweetRequestError(String msg);
    void postAllSweetsRequestError(String msg);
    void requestAddNewSweet(Sweet sweet);
    void postAddNewSweetRequestSuccess(String msg);
}
