package ro.ovidiuconeac.foodtavern.androidapp.features.food.rest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import ro.ovidiuconeac.models.features.featurex.Cheese;
import ro.ovidiuconeac.models.features.featurex.Fruit;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 *
 * Backend REST calls, used by Retrofit to
 * create the communication interface with
 * the server.
 */

public interface RestServiceApi {

    @GET("food/fruits/random")
    Call<Fruit> fetchFruit();

    @GET("food/fruits/all")
    Call<List<Fruit>> fetchAllFruits();

    @POST("food/fruits/new")
    void postNewFruit(Fruit fruit);

    @GET("food/cheeses/random")
    Call<Cheese> fetchCheese();

    @GET("food/cheeses/all")
    Call<List<Cheese>> fetchAllCheeses();

    @POST("food/cheeses/new")
    void postNewCheese(Cheese cheese);

    @GET("food/sweets/random")
    Call<Sweet> fetchSweet();

    @GET("food/sweets/all")
    Call<List<Sweet>> fetchAllSweets();

    @POST("food/sweets/new")
    void postNewSweets(Sweet sweet);
}