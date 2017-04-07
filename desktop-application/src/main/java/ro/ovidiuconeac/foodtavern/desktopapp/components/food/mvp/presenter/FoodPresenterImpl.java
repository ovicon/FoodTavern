package ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.presenter;

import javafx.application.Platform;
import ro.ovidiuconeac.foodtavern.common.exceptions.NoResultException;
import ro.ovidiuconeac.foodtavern.common.exceptions.RequestException;
import ro.ovidiuconeac.foodtavern.common.util.Util;
import ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.model.FoodUseCases;
import ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.view.FoodView;
import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * Created by ovidiu on 2/24/17.
 */
public class FoodPresenterImpl implements FoodPresenter {

    private FoodView view;
    private FoodUseCases model;

    public FoodPresenterImpl(FoodView view) {
        this.view = view;
        this.model = new FoodUseCases();
    }

    @Override
    public void requestFruit(RestServiceApi restServiceApi) {
        Executors.newSingleThreadExecutor().execute(() -> {
            Util.simulateNetworkLatency(4000);
            final Fruit fruit;
            try {
                fruit = model.getFruit(restServiceApi);
                Platform.runLater(() -> view.postFruit(fruit.getName()));
            } catch (RequestException | NoResultException e) {
                // Run on ui thread
                Platform.runLater(() -> view.postFruitRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestAllFruits(RestServiceApi restServiceApi) {
        Executors.newSingleThreadExecutor().execute(() -> {
            Util.simulateNetworkLatency(4000);
            final List<Fruit> fruits;
            try {
                fruits = model.getAllFruits(restServiceApi);
                Platform.runLater(() -> {
                    String[] namesOfFruits = new String[fruits.size()];
                    int i=0;
                    for (Fruit fruit: fruits) {
                        namesOfFruits[i++] = fruit.getName();
                    }
                    view.postAllFruits(namesOfFruits);
                });
            } catch (RequestException | NoResultException e) {
                // Run on ui thread
                Platform.runLater(() -> view.postAllFruitsRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestAddNewFruit(RestServiceApi restServiceApi, Fruit fruit) {
        Executors.newSingleThreadExecutor().execute(() -> {
            boolean successful;
            try {
                successful = model.addNewFruit(restServiceApi, fruit);
                Platform.runLater(() -> {
                    if (successful) {
                        view.postAddNewFruitRequestSuccess(fruit.getName());
                    }
                });
            } catch (RequestException | NoResultException e) {
                Platform.runLater(() -> view.postFruitRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestCheese(RestServiceApi restServiceApi) {
        Executors.newSingleThreadExecutor().execute(() -> {
            Util.simulateNetworkLatency(4000);
            final Cheese cheese;
            try {
                cheese = model.getCheese(restServiceApi);
                Platform.runLater(() -> view.postCheese(cheese.getName()));
            } catch (RequestException | NoResultException e) {
                // Run on ui thread
                Platform.runLater(() -> view.postCheeseRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestAllCheeses(RestServiceApi restServiceApi) {
        Executors.newSingleThreadExecutor().execute(() -> {
            Util.simulateNetworkLatency(4000);
            final List<Cheese> cheeses;
            try {
                cheeses = model.getAllCheeses(restServiceApi);
                Platform.runLater(() -> {
                    String[] namesOfCheeses = new String[cheeses.size()];
                    int i=0;
                    for (Cheese Cheese: cheeses) {
                        namesOfCheeses[i++] = Cheese.getName();
                    }
                    view.postAllCheeses(namesOfCheeses);
                });
            } catch (RequestException | NoResultException e) {
                // Run on ui thread
                Platform.runLater(() -> view.postAllCheesesRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestAddNewCheese(RestServiceApi restServiceApi, Cheese cheese) {
        Executors.newSingleThreadExecutor().execute(() -> {
            boolean successful;
            try {
                successful = model.addNewCheese(restServiceApi, cheese);
                Platform.runLater(() -> {
                    if (successful) {
                        view.postAddNewCheeseRequestSuccess(cheese.getName());
                    }
                });
            } catch (RequestException | NoResultException e) {
                Platform.runLater(() -> view.postCheeseRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestSweet(RestServiceApi restServiceApi) {
        Executors.newSingleThreadExecutor().execute(() -> {
            Util.simulateNetworkLatency(4000);
            final Sweet sweet;
            try {
                sweet = model.getSweet(restServiceApi);
                Platform.runLater(() -> view.postSweet(sweet.getName()));
            } catch (RequestException | NoResultException e) {
                // Run on ui thread
                Platform.runLater(() -> view.postSweetRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestAllSweets(RestServiceApi restServiceApi) {
        Executors.newSingleThreadExecutor().execute(() -> {
            Util.simulateNetworkLatency(4000);
            final List<Sweet> sweets;
            try {
                sweets = model.getAllSweets(restServiceApi);
                Platform.runLater(() -> {
                    String[] namesOfSweets = new String[sweets.size()];
                    int i=0;
                    for (Sweet Sweet: sweets) {
                        namesOfSweets[i++] = Sweet.getName();
                    }
                    view.postAllSweets(namesOfSweets);
                });
            } catch (RequestException | NoResultException e) {
                // Run on ui thread
                Platform.runLater(() -> view.postAllSweetsRequestError(e.getMessage()));
            }
        });
    }

    @Override
    public void requestAddNewSweet(RestServiceApi restServiceApi, Sweet sweet) {
        Executors.newSingleThreadExecutor().execute(() -> {
            boolean successful;
            try {
                successful = model.addNewSweet(restServiceApi, sweet);
                Platform.runLater(() -> {
                    if (successful) {
                        view.postAddNewSweetRequestSuccess(sweet.getName());
                    }
                });
            } catch (RequestException | NoResultException e) {
                Platform.runLater(() -> view.postSweetRequestError(e.getMessage()));
            }
        });
    }
}