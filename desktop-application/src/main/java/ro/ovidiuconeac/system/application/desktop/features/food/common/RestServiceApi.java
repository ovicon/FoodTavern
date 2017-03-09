package ro.ovidiuconeac.system.application.desktop.features.food.common;

import retrofit2.Call;
import retrofit2.http.GET;
import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;
import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;
import ro.ovidiuconeac.foodtavern.models.features.food.Sweet;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 *
 * Backend REST calls, used by Retrofit to
 * create the communication interface with
 * the server.
 */

public interface RestServiceApi {

    @GET("food/fruit")
    Call<Fruit> fetchFruit();

    @GET("food/cheese")
    Call<Cheese> fetchCheese();

    @GET("food/sweet")
    Call<Sweet> fetchSweet();
}
