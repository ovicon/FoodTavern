package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.model;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.exceptions.NoResultException;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.exceptions.RequestException;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.rest.RestServiceApi;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Feature X use cases.
 */
public class FoodUseCases {

    // Use case "get Fruit"
    public Fruit getFruit(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Fruit fruit = null;
        Call<Fruit> call = restServiceApi.fetchFruit();
        try {
            Response<Fruit> response = call.execute();
            switch (response.code()) {
                case 200: {
                    fruit = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return fruit;
    }

    // Use case "get all Fruits"
    public List<Fruit> getAllFruits(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        List<Fruit> fruits = null;
        Call<List<Fruit>> call = restServiceApi.fetchAllFruits();
        try {
            Response<List<Fruit>> response = call.execute();
            switch (response.code()) {
                case 200: {
                    fruits = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return fruits;
    }
    
    // Use case "get Cheese"
    public Cheese getCheese(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Cheese cheese = null;
        Call<Cheese> call = restServiceApi.fetchCheese();
        try {
            Response<Cheese> response = call.execute();
            switch (response.code()) {
                case 200: {
                    cheese = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return cheese;
    }

    // Use case "get all Cheese"
    public List<Cheese> getAllCheeses(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        List<Cheese> cheeses = null;
        Call<List<Cheese>> call = restServiceApi.fetchAllCheeses();
        try {
            Response<List<Cheese>> response = call.execute();
            switch (response.code()) {
                case 200: {
                    cheeses = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return cheeses;
    }

    // Use case "get Sweet"
    public Sweet getSweet(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Sweet sweet = null;
        Call<Sweet> call = restServiceApi.fetchSweet();
        try {
            Response<Sweet> response = call.execute();
            switch (response.code()) {
                case 200: {
                    sweet = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return sweet;
    }

    // Use case "get all Sweets"
    public List<Sweet> getAllSweets(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        List<Sweet> Sweets = null;
        Call<List<Sweet>> call = restServiceApi.fetchAllSweets();
        try {
            Response<List<Sweet>> response = call.execute();
            switch (response.code()) {
                case 200: {
                    Sweets = response.body();
                    break;
                }
                case 404: {
                    throw new NoResultException();
                }
            }
        } catch (IOException e) {
            throw new RequestException();
        }
        return Sweets;
    }
}