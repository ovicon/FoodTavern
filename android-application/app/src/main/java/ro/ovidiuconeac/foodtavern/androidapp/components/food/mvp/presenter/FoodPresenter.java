package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.presenter;

import ro.ovidiuconeac.foodtavern.androidapp.components.common.Presenter;
import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

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
