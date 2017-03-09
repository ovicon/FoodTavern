package ro.ovidiuconeac.system.application.desktop.features.food.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.beans.NamedArg;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.system.application.desktop.features.food.common.RestServiceApi;
import ro.ovidiuconeac.system.application.desktop.features.food.model.FoodUseCases;
import ro.ovidiuconeac.system.common.exceptions.NoResultException;
import ro.ovidiuconeac.system.common.exceptions.RequestException;

/**
 * Created by ovidiu on 2/24/17.
 */
public class FoodViewImpl extends Scene implements FoodView {

    private StackPane stackPane;

    public FoodViewImpl(@NamedArg("root") StackPane stackPane) {
        super(stackPane, 300, 350);
        this.stackPane = stackPane;
        create();
    }

    private void create() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit service = new Retrofit.Builder()
                .baseUrl("http://localhost:1984/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        RestServiceApi restServiceApi = service.create(RestServiceApi.class);


        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        stackPane.getChildren().add(btn);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    FoodUseCases foodUseCases = new FoodUseCases();
                    System.out.println(foodUseCases.getCheese1(restServiceApi).getName());
                } catch (RequestException e) {
                    e.printStackTrace();
                } catch (NoResultException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
