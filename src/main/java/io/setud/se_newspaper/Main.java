package io.setud.se_newspaper;

import io.setud.se_newspaper.controllers.SplashScreenController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Boolean isSplashLoad = false;

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
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