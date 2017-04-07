package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.presenter;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ro.ovidiuconeac.foodtavern.androidapp.components.common.Screen;
import ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.model.FoodUseCases;
import ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.view.FoodView;
import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.exceptions.NoResultException;
import ro.ovidiuconeac.foodtavern.common.exceptions.RequestException;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;
import ro.ovidiuconeac.foodtavern.common.util.Util;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Implementation for the main presenter.
 * Must implement {@link FoodPresenter}
 */

public class FoodPresenterImpl implements FoodPresenter {

    private UUID uuid;
    private FoodView view;
    private FoodUseCases model;

    public FoodPresenterImpl(FoodView view) {
        this.uuid = UUID.randomUUID();
        this.view = view;
        this.model = new FoodUseCases();
    }

    @Override
    public void requestFruit(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Fruit>() {

            @Override
            protected Fruit doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Fruit fruit = new Fruit("");
                try {
                    fruit = model.getFruit(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postFruitRequestError(e.getMessage()));
                }
                return fruit;
            }

            @Override
            protected void onPostExecute(Fruit fruit) {
                super.onPostExecute(fruit);
                view.postFruit(fruit.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAllFruits(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, List<Fruit>>() {

            @Override
            protected List<Fruit> doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                List<Fruit> fruits = new ArrayList<>();
                try {
                    fruits = model.getAllFruits(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postFruitRequestError(e.getMessage()));
                }
                return fruits;
            }

            @Override
            protected void onPostExecute(List<Fruit> fruits) {
                super.onPostExecute(fruits);
                String[] namesOfFruits =  new String[fruits.size()];
                int i=0;
                for (Fruit fruit: fruits) {
                    namesOfFruits[i++] = fruit.getName();
                }
                view.postAllFruits(namesOfFruits);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAddNewFruit(RestServiceApi restServiceApi, Fruit fruit) {
        new AsyncTask<Void, Void, Boolean>() {

            @Override
            protected Boolean doInBackground(Void... params) {
                boolean successful = false;
                try {
                    successful = model.addNewFruit(restServiceApi, fruit);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postFruitRequestError(e.getMessage()));
                }
                return successful;
            }

            @Override
            protected void onPostExecute(Boolean successful) {
                super.onPostExecute(successful);
                if (successful) {
                    view.postAddNewFruitRequestSuccess(fruit.getName());
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestCheese(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Cheese>() {

            @Override
            protected Cheese doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Cheese cheese = new Cheese("");
                try {
                    cheese = model.getCheese(restServiceApi);
                } catch (final RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postCheeseRequestError(e.getMessage()));
                }
                return cheese;
            }

            @Override
            protected void onPostExecute(Cheese cheese) {
                super.onPostExecute(cheese);
                view.postCheese(cheese.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAllCheeses(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, List<Cheese>>() {

            @Override
            protected List<Cheese> doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                List<Cheese> cheeses = new ArrayList<>();
                try {
                    cheeses = model.getAllCheeses(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postCheeseRequestError(e.getMessage()));
                }
                return cheeses;
            }

            @Override
            protected void onPostExecute(List<Cheese> Cheeses) {
                super.onPostExecute(Cheeses);
                String[] namesOfCheeses =  new String[Cheeses.size()];
                int i=0;
                for (Cheese Cheese: Cheeses) {
                    namesOfCheeses[i++] = Cheese.getName();
                }
                view.postAllCheeses(namesOfCheeses);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAddNewCheese(RestServiceApi restServiceApi, Cheese cheese) {
        new AsyncTask<Void, Void, Boolean>() {

            @Override
            protected Boolean doInBackground(Void... params) {
                boolean successful = false;
                try {
                    successful = model.addNewCheese(restServiceApi, cheese);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postCheeseRequestError(e.getMessage()));
                }
                return successful;
            }

            @Override
            protected void onPostExecute(Boolean successful) {
                super.onPostExecute(successful);
                if (successful) {
                    view.postAddNewCheeseRequestSuccess(cheese.getName());
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestSweet(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, Sweet>() {

            @Override
            protected Sweet doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                Sweet sweet = new Sweet("");
                try {
                    sweet = model.getSweet(restServiceApi);
                } catch (final RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postSweetRequestError(e.getMessage()));
                }
                return sweet;
            }

            @Override
            protected void onPostExecute(Sweet sweet) {
                super.onPostExecute(sweet);
                view.postSweet(sweet.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAllSweets(final RestServiceApi restServiceApi) {
        new AsyncTask<Void, Void, List<Sweet>>() {

            @Override
            protected List<Sweet> doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                List<Sweet> Sweets = new ArrayList<>();
                try {
                    Sweets = model.getAllSweets(restServiceApi);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postSweetRequestError(e.getMessage()));
                }
                return Sweets;
            }

            @Override
            protected void onPostExecute(List<Sweet> Sweets) {
                super.onPostExecute(Sweets);
                String[] namesOfSweets =  new String[Sweets.size()];
                int i=0;
                for (Sweet Sweet: Sweets) {
                    namesOfSweets[i++] = Sweet.getName();
                }
                view.postAllSweets(namesOfSweets);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestAddNewSweet(RestServiceApi restServiceApi, Sweet sweet) {
        new AsyncTask<Void, Void, Boolean>() {

            @Override
            protected Boolean doInBackground(Void... params) {
                boolean successful = false;
                try {
                    successful = model.addNewSweet(restServiceApi, sweet);
                } catch (RequestException | NoResultException e) {
                    // Post on ui thread
                    new Handler(Looper.getMainLooper())
                            .post(() -> view.postSweetRequestError(e.getMessage()));
                }
                return successful;
            }

            @Override
            protected void onPostExecute(Boolean successful) {
                super.onPostExecute(successful);
                if (successful) {
                    view.postAddNewSweetRequestSuccess(sweet.getName());
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void setScreen(Screen screen) {
        this.view = (FoodView) screen;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }
}