package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.model;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.exceptions.NoResultException;
import ro.ovidiuconeac.foodtavern.common.exceptions.RequestException;
import ro.ovidiuconeac.foodtavern.common.util.ResponseBodyUtil;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Feature Food use cases.
 */
public class FoodUseCases {

    // Use case "get Fruit"
    public Fruit getFruit(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Call<Fruit> call = restServiceApi.getFruit();
        try {
            Response<Fruit> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromRandom(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case "get all Fruits"
    public List<Fruit> getAllFruits(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Call<List<Fruit>> call = restServiceApi.getAllFruits();
        try {
            Response<List<Fruit>> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromList(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case add new fruit
    public boolean addNewFruit(RestServiceApi restServiceApi, Fruit fruit) throws RequestException, NoResultException {
        Call<Boolean> call = restServiceApi.postNewFruit(fruit);
        try {
            Response<Boolean> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromBoolean(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case "get Cheese"
    public Cheese getCheese(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Call<Cheese> call = restServiceApi.getCheese();
        try {
            Response<Cheese> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromRandom(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case "get all Cheese"
    public List<Cheese> getAllCheeses(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Call<List<Cheese>> call = restServiceApi.getAllCheeses();
        try {
            Response<List<Cheese>> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromList(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case add new cheese
    public boolean addNewCheese(RestServiceApi restServiceApi, Cheese cheese) throws RequestException, NoResultException {
        Call<Boolean> call = restServiceApi.postNewCheese(cheese);
        try {
            Response<Boolean> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromBoolean(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case "get Sweet"
    public Sweet getSweet(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Call<Sweet> call = restServiceApi.getSweet();
        try {
            Response<Sweet> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromRandom(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case "get all Sweets"
    public List<Sweet> getAllSweets(RestServiceApi restServiceApi) throws RequestException, NoResultException {
        Call<List<Sweet>> call = restServiceApi.getAllSweets();
        try {
            Response<List<Sweet>> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromList(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }

    // Use case add new sweet
    public boolean addNewSweet(RestServiceApi restServiceApi, Sweet sweet) throws RequestException, NoResultException {
        Call<Boolean> call = restServiceApi.postNewSweet(sweet);
        try {
            Response<Boolean> response = call.execute();
            return ResponseBodyUtil.getResponseBodyFromBoolean(response);
        } catch (IOException e) {
            throw new RequestException();
        }
    }
}