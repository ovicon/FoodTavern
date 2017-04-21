package ro.ovidiuconeac.foodtavern.common.util;

import java.util.List;

import retrofit2.Response;
import ro.ovidiuconeac.foodtavern.common.exceptions.NoResultException;
import ro.ovidiuconeac.foodtavern.common.exceptions.RequestException;
import ro.ovidiuconeac.foodtavern.common.models.Food;

/**
 * Created by www.ovidiuconeac.ro on 3/20/17.
 */

@SuppressWarnings("Duplicates")
public abstract class ResponseBodyUtil {

    public static <T extends Food> T getResponseBodyFromRandom(Response<T> response) throws NoResultException, RequestException {
        T t = null;
        switch (response.code()) {
            case 200: {
                t = response.body();
                break;
            }
            case 404: {
                throw new NoResultException();
            }
        }
        return t;
    }

    public static <T extends Food> List<T> getResponseBodyFromList(Response<List<T>> response) throws NoResultException {
        List<T> t = null;
        switch (response.code()) {
            case 200: {
                t = response.body();
                break;
            }
            case 404: {
                throw new NoResultException();
            }
        }
        return t;
    }

    public static Boolean getResponseBodyFromBoolean(Response<Boolean> response) throws NoResultException {
        Boolean b = null;
        switch (response.code()) {
            case 200: {
                b = response.body();
                break;
            }
            case 404: {
                throw new NoResultException();
            }
        }
        return b;
    }
}
