package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        FoodUseCasesTest.class,
        FoodUseCasesWithRequestExceptionTest.class,
        FoodUseCasesWithNoResultExceptionTest.class
})
public class FoodUseCasesTestSuite {
}
