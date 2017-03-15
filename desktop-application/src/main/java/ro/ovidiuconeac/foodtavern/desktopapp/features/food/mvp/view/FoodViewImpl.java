package ro.ovidiuconeac.foodtavern.desktopapp.features.food.mvp.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.foodtavern.desktopapp.features.food.mvp.presenter.FoodPresenter;
import ro.ovidiuconeac.foodtavern.desktopapp.features.food.mvp.presenter.FoodPresenterImpl;
import ro.ovidiuconeac.foodtavern.desktopapp.features.food.rest.RestServiceApi;
import ro.ovidiuconeac.foodtavern.models.features.food.Cheese;
import ro.ovidiuconeac.foodtavern.models.features.food.Fruit;
import ro.ovidiuconeac.foodtavern.models.features.food.Sweet;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * Created by ovidiu on 2/24/17.
 */
public class FoodViewImpl implements Initializable, FoodView {

    // Server
    @FXML
    private TextField serverConnection;

    // Fruit
    @FXML
    private ProgressIndicator progressBarFruit;
    @FXML
    private TextField fruit;
    @FXML
    private Button getFruit;
    @FXML
    private ProgressIndicator progressBarAllFruits;
    @FXML
    private Button getAllFruits;
    @FXML
    private Button newFruit;

    // Cheese
    @FXML
    private ProgressIndicator progressBarCheese;
    @FXML
    private TextField cheese;
    @FXML
    private Button getCheese;
    @FXML
    private ProgressIndicator progressBarAllCheeses;
    @FXML
    private Button getAllCheeses;
    @FXML
    private Button newCheese;

    // Sweet
    @FXML
    private ProgressIndicator progressBarSweet;
    @FXML
    private TextField sweet;
    @FXML
    private Button getSweet;
    @FXML
    private ProgressIndicator progressBarAllSweets;
    @FXML
    private Button getAllSweets;
    @FXML
    private Button newSweet;

    private FoodPresenter presenter;
    private RestServiceApi restServiceApi;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.presenter = new FoodPresenterImpl(this);
        initializeRestService();
    }

    private void initializeRestService() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit service = new Retrofit.Builder()
                .baseUrl("http://localhost:1984") // TODO
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        restServiceApi = service.create(RestServiceApi.class);
    }

    public static void main(String[] args) {
        new FoodViewImpl().requestFruit();
    }

    @FXML
    @Override
    public void requestFruit() {
        this.enableUiFruit(false);
        presenter.requestFruit(restServiceApi);
    }

    @Override
    public void postFruit(String fruit) {
        this.fruit.setText(fruit);
        this.enableUiFruit(true);
    }

    private void enableUiFruit(boolean enable) {
        if (enable) {
            progressBarFruit.setVisible(false);
        } else {
            progressBarFruit.setVisible(true);
        }
        fruit.setEditable(!enable);
        getFruit.setDisable(!enable);
    }

    @FXML
    @Override
    public void requestAllFruits() {
        this.enableUiAllFruits(false);
        presenter.requestAllFruits(restServiceApi);
    }

    @Override
    public void postAllFruits(String[] fruits) {
        Arrays.stream(fruits).forEach(System.out::println);
        this.enableUiAllFruits(true);
    }

    private void enableUiAllFruits(boolean enable) {
        if (enable) {
            progressBarAllFruits.setVisible(false);
        } else {
            progressBarAllFruits.setVisible(true);
        }
        getAllFruits.setDisable(!enable);
    }

    @Override
    public void postFruitRequestError(String msg) {
        System.out.println(msg);
    }

    @FXML
    private void addNewFruit() {
        System.out.println("addNewFruit");
    }

    @Override
    public void requestAddNewFruit(Fruit fruit) {

    }

    @Override
    public void postAddNewFruitRequestSuccess(String msg) {
        System.out.println(msg);
    }

    @FXML
    @Override
    public void requestCheese() {
        enableUiCheese(false);
        presenter.requestCheese(restServiceApi);
    }

    @Override
    public void postCheese(String cheese) {
        this.cheese.setText(cheese);
        enableUiCheese(true);
    }

    private void enableUiCheese(boolean enable) {
        if (enable) {
            progressBarCheese.setVisible(false);
        } else {
            progressBarCheese.setVisible(true);
        }
        cheese.setEditable(!enable);
        getCheese.setDisable(!enable);
    }

    @FXML
    @Override
    public void requestAllCheeses() {
        this.enableUiAllCheeses(false);
        presenter.requestAllCheeses(restServiceApi);
    }

    @Override
    public void postAllCheeses(String[] cheeses) {
        Arrays.stream(cheeses).forEach(System.out::println);
        this.enableUiAllCheeses(true);
    }

    private void enableUiAllCheeses(boolean enable) {
        if (enable) {
            progressBarAllCheeses.setVisible(false);
        } else {
            progressBarAllCheeses.setVisible(true);
        }
        getAllCheeses.setDisable(!enable);
    }

    @Override
    public void postCheeseRequestError(String msg) {
        System.out.println(msg);
    }

    @FXML
    private void addNewCheese() {
        System.out.println("addNewCheese");
    }

    @Override
    public void requestAddNewCheese(Cheese cheese) {

    }

    @Override
    public void postAddNewCheeseRequestSuccess(String msg) {
        System.out.println(msg);
    }

    @FXML
    @Override
    public void requestSweet() {
        enableUiSweet(false);
        presenter.requestSweet(restServiceApi);
    }

    @Override
    public void postSweet(String sweet) {
        this.sweet.setText(sweet);
        enableUiSweet(true);
    }

    private void enableUiSweet(boolean enable) {
        if (enable) {
            progressBarSweet.setVisible(false);
        } else {
            progressBarSweet.setVisible(true);
        }
        sweet.setEditable(!enable);
        getSweet.setDisable(!enable);
    }

    @FXML
    @Override
    public void requestAllSweets() {
        enableUiAllSweets(false);
        presenter.requestAllSweets(restServiceApi);
    }

    @Override
    public void postAllSweets(String[] sweets) {
        Arrays.stream(sweets).forEach(System.out::println);
        enableUiAllSweets(true);
    }

    private void enableUiAllSweets(boolean enable) {
        if (enable) {
            progressBarAllSweets.setVisible(false);
        } else {
            progressBarAllSweets.setVisible(true);
        }
        getAllSweets.setDisable(!enable);
    }

    @Override
    public void postSweetRequestError(String msg) {
        System.out.println(msg);
    }

    @FXML
    private void addNewSweet() {
        System.out.println("addNewSweet");
    }

    @Override
    public void requestAddNewSweet(Sweet sweet) {

    }

    @Override
    public void postAddNewSweetRequestSuccess(String msg) {
        System.out.println(msg);
        System.out.println(msg);
    }
}
