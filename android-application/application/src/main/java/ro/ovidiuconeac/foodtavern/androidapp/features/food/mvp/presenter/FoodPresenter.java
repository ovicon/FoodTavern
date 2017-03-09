package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.presenter;

import ro.ovidiuconeac.foodtavern.androidapp.features.common.Presenter;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.rest.RestServiceApi;

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
    void requestAddNewFruit(RestServiceApi restServiceApi);
    // Cheeses
    void requestCheese(RestServiceApi restServiceApi);
    void requestAllCheeses(RestServiceApi restServiceApi);
    void requestAddNewCheese(RestServiceApi restServiceApi);
    // Sweets
    void requestSweet(RestServiceApi restServiceApi);
    void requestAllSweets(RestServiceApi restServiceApi);
    void requestAddNewSweet(RestServiceApi restServiceApi);
}
