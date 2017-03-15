package ro.ovidiuconeac.foodtavern.wearapp.food.mvp.presenter;

import ro.ovidiuconeac.foodtavern.androidapp.features.common.Presenter;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.rest.RestServiceApi;
import ro.ovidiuconeac.models.features.food.Cheese;
import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.models.features.food.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Main presenter interface.
 * Must implement {@link Presenter} to
 * support methods for presenter caching.
 */

public interface FoodPresenter extends Presenter {
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
