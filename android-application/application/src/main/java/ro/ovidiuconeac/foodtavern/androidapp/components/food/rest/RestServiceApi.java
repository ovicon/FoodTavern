package ro.ovidiuconeac.foodtavern.androidapp.components.food.rest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 *
 * Backend REST calls, used by Retrofit to
 * create the communication interface with
 * the server.
 */

public interface RestServiceApi {

    @GET("food/fruits/random")
    Call<Fruit> getFruit();

    @GET("food/fruits/all")
    Call<List<Fruit>> getAllFruits();

    @PUT("food/fruits/new")
    Call<Boolean> putNewFruit(@Body Fruit fruit);

    @GET("food/cheeses/random")
    Call<Cheese> getCheese();

    @GET("food/cheeses/all")
    Call<List<Cheese>> getAllCheeses();

    @PUT("food/cheeses/new")
    Call<Boolean> putNewCheese(@Body Cheese cheese);

    @GET("food/sweets/random")
    Call<Sweet> getSweet();

    @GET("food/sweets/all")
    Call<List<Sweet>> getAllSweets();

    @PUT("food/sweets/new")
    Call<Boolean> putNewSweet(@Body Sweet sweet);
}