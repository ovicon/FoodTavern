package ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.model;

import ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.presenter.FoodPresenter;

/**
 * Created by ovidiu on 4/10/17.
 */
public class FoodUseCases {

    FoodPresenter foodPresenter;

    public FoodUseCases(FoodPresenter foodPresenter) {
        this.foodPresenter = foodPresenter;
    }
}
