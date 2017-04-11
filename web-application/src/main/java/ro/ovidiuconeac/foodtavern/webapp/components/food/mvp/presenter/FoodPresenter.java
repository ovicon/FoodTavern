package ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.presenter;

import ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.model.FoodUseCases;
import ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.view.FoodView;

/**
 * Created by ovidiu on 4/10/17.
 */
public class FoodPresenter {

    FoodView view;
    FoodUseCases model;

    public FoodPresenter(FoodView foodView) {
        this.view = foodView;
        this.model = new FoodUseCases(this);
    }
}
