package ro.ovidiuconeac.foodtavern.webapp.components;

import ro.ovidiuconeac.foodtavern.webapp.components.food.mvp.view.FoodView;
import ro.ovidiuconeac.foodtavern.webapp.components.serverconnection.mvp.view.ServerConnectionView;

/**
 * Created by ovidiu on 4/10/17.
 */
public class Main {

    private FoodView foodView = new FoodView();
    private ServerConnectionView connectionView = new ServerConnectionView();

    Navigation navigation = Navigation.getInstance();



}
