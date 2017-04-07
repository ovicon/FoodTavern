package ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.presenter;

import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

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
