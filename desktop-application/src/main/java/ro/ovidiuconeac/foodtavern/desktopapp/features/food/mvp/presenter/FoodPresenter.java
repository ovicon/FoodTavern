package ro.ovidiuconeac.foodtavern.desktopapp.features.food.mvp.presenter;

import ro.ovidiuconeac.foodtavern.desktopapp.features.food.rest.RestServiceApi;
import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;
import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;
import ro.ovidiuconeac.foodtavern.models.features.food.Sweet;

/**
 * Created by ovidiu on 2/24/17.
 */
public interface FoodPresenter {
    // Fruits
    void requestFruit(RestServiceApi restServiceApi);
    void requestAllFruits(RestServiceApi restServiceApi);
    void requestAddNewFruit(RestServiceApi restServiceApi, Fruit fruit);
    // Cheeses
    void requestCheese(RestServiceApi restServiceApi);
    void requestAllCheeses(RestServiceApi restServiceApi);
    void requestAddNewCheese(RestServiceApi restServiceApi, Cheese cheese);
    // Sweets
    void requestSweet(RestServiceApi restServiceApi);
    void requestAllSweets(RestServiceApi restServiceApi);
    void requestAddNewSweet(RestServiceApi restServiceApi, Sweet sweet);
}
