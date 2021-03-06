package ro.ovidiuconeac.foodtavern.common.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

import java.util.List;

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

    @POST("food/fruits/new")
    Call<Boolean> postNewFruit(@Body Fruit fruit);

    @GET("food/cheeses/random")
    Call<Cheese> getCheese();

    @GET("food/cheeses/all")
    Call<List<Cheese>> getAllCheeses();

    @POST("food/cheeses/new")
    Call<Boolean> postNewCheese(@Body Cheese cheese);

    @GET("food/sweets/random")
    Call<Sweet> getSweet();

    @GET("food/sweets/all")
    Call<List<Sweet>> getAllSweets();

    @POST("food/sweets/new")
    Call<Boolean> postNewSweet(@Body Sweet sweet);
}