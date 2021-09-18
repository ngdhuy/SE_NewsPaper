package io.setud.se_newspaper.controllers;

import io.setud.se_newspaper.Main;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainScreenController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private StackPane root;
    private static StackPane rootP;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (!Main.isSplashLoad) {
            loadSplashScreen();
        }

        rootP = this.root;
    }

    private void loadSplashScreen() {
        try {
            Main.isSplashLoad = true;
            StackPane pane = FXMLLoader.load(Main.class.getResource("SplashScreen.fxml"));
            root.getChildren().setAll(pane);

            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);

            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);

            fadeIn.play();

            fadeIn.setOnFinished((e) -> {
                fadeOut.play();
            });

            fadeOut.setOnFinished((e) -> {
                root.getChildren().remove(pane);
                try {
                    StackPane parentContent = FXMLLoader.load(Main.class.getResource(("MainScreen.fxml")));
                    root.getChildren().remove(pane);
                    root.getChildren().setAll(parentContent);
                } catch (IOException ex) {
                    Logger.getLogger(MainScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(MainScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}