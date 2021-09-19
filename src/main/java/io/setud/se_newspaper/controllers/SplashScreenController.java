package io.setud.se_newspaper.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * io.setud.se_newspaper
 * Created by ndhuy
 * Date 13/09/2021 - 19:51
 * Description: ...
 */
public class SplashScreenController implements Initializable {
    @FXML
    private StackPane root;

    @FXML
    private ProgressBar progressBar;
    public static ProgressBar progressBarStatic;

    public static int loadingTime = 5000;    //milisecond

    class ShowSplashScreen extends Thread {
        @Override
        public void run() {
            int duration = SplashScreenController.loadingTime / 100;
            try {
                for(int i = 0; i <= 100; i++) {
                    SplashScreenController.progressBarStatic.setProgress((double) i/100);
                    Thread.sleep(duration);
                }
            } catch (InterruptedException e) {
                Logger.getLogger(SplashScreenController.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        progressBarStatic = this.progressBar;
        new ShowSplashScreen().start();
    }
}
