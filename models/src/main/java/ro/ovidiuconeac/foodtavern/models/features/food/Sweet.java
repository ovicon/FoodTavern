package ro.ovidiuconeac.foodtavern.models.features.food;

/**
 * Created by ovidiu on 2/7/17.
 */

public class Sweet extends Food {

    // Required for Json deserialization
    public Sweet() {}

    public Sweet(String name) {
        this.name = name;
    }
}
