package ro.ovidiuconeac.system.application.desktop;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ro.ovidiuconeac.system.application.desktop.features.food.view.FoodViewImpl;

import java.io.IOException;

/**
 * Created by ovidiu on 2/24/17.
 */
public class DesktopApplication extends javafx.application.Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new FoodViewImpl(FXMLLoader.load(getClass().getResource("features/food/view/food_layout.fxml")));
        stage.setScene(scene);
        stage.show();
    }
}