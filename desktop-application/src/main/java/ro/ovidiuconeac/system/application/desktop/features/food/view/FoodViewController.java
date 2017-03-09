package ro.ovidiuconeac.system.application.desktop.features.food.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.system.application.desktop.features.food.common.RestServiceApi;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by ovidiu on 2/24/17.
 */
public class FoodViewController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit service = new Retrofit.Builder()
                .baseUrl("http://localhost:1984/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        RestServiceApi restServiceApi = service.create(RestServiceApi.class);



        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
