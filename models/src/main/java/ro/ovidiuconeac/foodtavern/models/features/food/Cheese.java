package ro.ovidiuconeac.foodtavern.models.features.food;

/**
 * Created by ovidiu on 2/7/17.
 */

public class Cheese extends Food {

    // Required for Json deserialization
    public Cheese() {}

    public Cheese(String name) {
        this.name = name;
    }
}
