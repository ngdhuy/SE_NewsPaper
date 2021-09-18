package io.setud.se_newspaper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Boolean isSplashLoad = false;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("MainScreen.fxml"));
        Scene sceneMain = new Scene(root);

        stage.setTitle("SEstudio News Paper");
        stage.setScene(sceneMain);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}