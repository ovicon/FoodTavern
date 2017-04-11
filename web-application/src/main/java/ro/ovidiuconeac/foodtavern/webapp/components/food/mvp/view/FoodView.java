package ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.view;

import ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.presenter.FoodPresenter;

/**
 * Created by ovidiu on 4/10/17.
 */
public class FoodView {

    FoodPresenter presenter = new FoodPresenter(this);
}
