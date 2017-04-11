package ro.ovidiuconeac.foodtavern.webapp.components;

/**
 * Created by ovidiu on 4/10/17.
 */
public class Navigation {
    private static Navigation ourInstance = new Navigation();

    public static Navigation getInstance() {
        return ourInstance;
    }

    private Navigation() {
    }
}
