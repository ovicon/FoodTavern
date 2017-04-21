package ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.foodtavern.common.api.RestServiceApi;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;
import ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.presenter.FoodPresenter;
import ro.ovidiuconeac.foodtavern.desktopapp.components.food.mvp.presenter.FoodPresenterImpl;

import java.net.URL;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by ovidiu on 2/24/17.
 */
public class FoodViewImpl implements Initializable, FoodView {

    private static RestServiceApi restServiceApi;

    // Server
    private @FXML TextField serverConnection;

    // Fruit
    private @FXML ProgressIndicator progressBarFruit;
    private @FXML TextField fruit;
    private @FXML Button getFruit;
    private @FXML ProgressIndicator progressBarAllFruits;
    private @FXML Button getAllFruits;

    // Cheese
    private @FXML ProgressIndicator progressBarCheese;
    private @FXML TextField cheese;
    private @FXML Button getCheese;
    private @FXML ProgressIndicator progressBarAllCheeses;
    private @FXML Button getAllCheeses;

    // Sweet
    private @FXML ProgressIndicator progressBarSweet;
    private @FXML TextField sweet;
    private @FXML Button getSweet;
    private @FXML ProgressIndicator progressBarAllSweets;
    private @FXML Button getAllSweets;

    // Status
    private @FXML Label status;

    private FoodPresenter presenter;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.presenter = new FoodPresenterImpl(this);
        initializeRestService();
    }

    @FXML
    private void initializeRestService() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit service = new Retrofit.Builder()
                .baseUrl(getServerConnection())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        restServiceApi = service.create(RestServiceApi.class);
    }

    @FXML
    @Override
    public void requestFruit() {
        enableUiFruit(false);
        presenter.requestFruit(restServiceApi);
    }

    @Override
    public void postFruit(String fruit) {
        this.fruit.setText(fruit);
        enableUiFruit(true);
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
        enableUiAllFruits(false);
        presenter.requestAllFruits(restServiceApi);
    }

    @Override
    public void postAllFruits(String[] fruits) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Fruits");
        alert.setHeaderText("");
        alert.setContentText(getNamesAsStringFrom(fruits));
        alert.show();
        this.enableUiAllFruits(true);
    }

    private String getNamesAsStringFrom(String[] fruits) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(fruits).forEach(s -> {
            builder.append(s);
            builder.append("\n");
        });
        return builder.toString();
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
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(msg);
        alert.show();
        enableUiFruit(true);
    }

    @Override
    public void postAllFruitsRequestError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(msg);
        alert.show();
        enableUiAllFruits(true);
    }

    @FXML
    private void addNewFruit() {
        TextInputDialog textInput = new TextInputDialog("");
        textInput.setTitle("Add New Fruit");
        textInput.setHeaderText("");
        Optional<String> result = textInput.showAndWait();
        result.ifPresent(s -> {
            if (!s.isEmpty()) {
                requestAddNewFruit(new Fruit(s));
            }
        });
    }

    @Override
    public void requestAddNewFruit(Fruit fruit) {
        presenter.requestAddNewFruit(restServiceApi, fruit);
    }

    @Override
    public void postAddNewFruitRequestSuccess(String msg) {
        status.setText("Added new fruit: " + msg);
        resetStatus();
    }

    private void resetStatus() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    // Log error
                }
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        status.setText("");
                    }
                });
            }
        }).start();
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
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cheeses");
        alert.setHeaderText("");
        alert.setContentText(getNamesAsStringFrom(cheeses));
        alert.show();
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
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(msg);
        alert.show();
        enableUiCheese(true);
    }

    @Override
    public void postAllCheesesRequestError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(msg);
        alert.show();
        enableUiAllCheeses(true);
    }

    @FXML
    private void addNewCheese() {
        TextInputDialog textInput = new TextInputDialog("");
        textInput.setTitle("Add New Cheese");
        textInput.setHeaderText("");
        Optional<String> result = textInput.showAndWait();
        result.ifPresent(s -> {
            if (!s.isEmpty()) {
                requestAddNewCheese(new Cheese(s));
            }
        });
    }

    @Override
    public void requestAddNewCheese(Cheese cheese) {
        presenter.requestAddNewCheese(restServiceApi, cheese);
    }

    @Override
    public void postAddNewCheeseRequestSuccess(String msg) {
        status.setText("Added new cheese: " + msg);
        resetStatus();
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
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sweets");
        alert.setHeaderText("");
        alert.setContentText(getNamesAsStringFrom(sweets));
        alert.show();
        this.enableUiAllSweets(true);
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
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(msg);
        alert.show();
        enableUiSweet(true);

    }

    @Override
    public void postAllSweetsRequestError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(msg);
        alert.show();
        enableUiAllSweets(true);
    }

    @FXML
    private void addNewSweet() {
        TextInputDialog textInput = new TextInputDialog("");
        textInput.setTitle("Add New Sweet");
        textInput.setHeaderText("");
        Optional<String> result = textInput.showAndWait();
        result.ifPresent(s -> {
            if(!s.isEmpty()) {
                requestAddNewSweet(new Sweet(s));
            }
        });
    }

    @Override
    public void requestAddNewSweet(Sweet sweet) {
        presenter.requestAddNewSweet(restServiceApi, sweet);
    }

    @Override
    public void postAddNewSweetRequestSuccess(String msg) {
        status.setText("Added new sweet: " + msg);
        resetStatus();
    }

    private String getServerConnection() {
        return serverConnection == null || serverConnection.getText().isEmpty() ? "http://localhost:1984" : serverConnection.getText();
    }
}
