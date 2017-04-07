package ro.ovidiuconeac.foodtavern.common.models;

/**
 * Created by ovidiu on 2/7/17.
 */

public class Fruit extends Food {

    // Required for Json deserialization
    public Fruit() {}

    public Fruit(String name) {
        this.name = name;
    }
}
