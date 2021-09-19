package io.setud.se_newspaper.controllers;

import io.setud.se_newspaper.Main;
import io.setud.se_newspaper.models.Category;
import io.setud.se_newspaper.models.News;
import io.setud.se_newspaper.util.Loader;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainScreenController implements Initializable {
    @FXML
    private VBox vNewest;
    public static VBox svNewest;

    @FXML
    private VBox vBusiness;
    public static VBox svBusiness;

    @FXML
    private VBox vCovid;
    public static VBox svCovid;

    @FXML
    private VBox vEntertainment;
    public static VBox svEntertainment;

    @FXML
    private VBox vHealth;
    public static VBox svHealth;

    @FXML
    private VBox vOthers;
    public static VBox svOthers;

    @FXML
    private VBox vPolitics;
    public static VBox svPolitics;

    @FXML
    private VBox vSports;
    public static VBox svSports;

    @FXML
    private VBox vTechnology;
    public static VBox svTechnology;

    @FXML
    private VBox vWorld;
    public static VBox svWorld;

    @FXML
    private StackPane root;

    public Loader loader = new Loader();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        svNewest = this.vNewest;
        svBusiness = this.vBusiness;
        svCovid = this.vCovid;
        svEntertainment = this.vEntertainment;
        svHealth = this.vHealth;
        svOthers = this.vOthers;
        svPolitics = this.vPolitics;
        svSports = this.vSports;
        svTechnology = this.vTechnology;
        svWorld = this.vWorld;

        if (!Main.isSplashLoad) {
            loadSplashScreen();
        }
    }

    class LoadDataThearding extends Thread {
        @Override
        public void run() {
            try {
                loader.LoadData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void loadSplashScreen() {
        try {
            new LoadDataThearding().start();

            Main.isSplashLoad = true;
            StackPane pane = FXMLLoader.load(Main.class.getResource("SplashScreen.fxml"));
            this.root.getChildren().setAll(pane);

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
                try {
                    StackPane parentContent = FXMLLoader.load(Main.class.getResource(("MainScreen.fxml")));
                    this.root.getChildren().remove(pane);
                    this.root.getChildren().setAll(parentContent);
                    this.LoadData();
                } catch (IOException ex) {
                    Logger.getLogger(MainScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(MainScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LoadData() {
        this.LoadFeed(loader.lstNewest, svNewest);
        this.LoadFeed(loader.lstBusiness, svBusiness);
        this.LoadFeed(loader.lstCovid, svCovid);
        this.LoadFeed(loader.lstEntertainment, svEntertainment);
        this.LoadFeed(loader.lstHealth, svHealth);
        this.LoadFeed(loader.lstOthers, svOthers);
        this.LoadFeed(loader.lstPolitics, svPolitics);
        this.LoadFeed(loader.lstSports, svSports);
        this.LoadFeed(loader.lstTechnology, svTechnology);
        this.LoadFeed(loader.lstWorld, svWorld);
    }

    private void LoadFeed(ArrayList<Category> categories, VBox svCategory) {
        int i = 0;
        HBox hbLine = new HBox();
        hbLine.setPadding(new Insets(15, 15, 15, 15));
        hbLine.setSpacing(10);
        svCategory.getChildren().add(hbLine);

        int temp = 0;

        for(Category category : categories) {
            for(News news : category.getFeed().getLstNews()) {
                VBox vBox = new VBox();
                vBox.getStyleClass().add("box");
                Image img;
                if (news.getUrlThumbnail().length() > 0)
                    img = new Image(news.getUrlThumbnail());
                else
                    img = new Image(Main.class.getResource("images/no_image.png").toString());

                ImageView imgView = new ImageView();
                imgView.setImage(img);
                imgView.setFitWidth(380);
                imgView.setFitHeight(200);

                Text title = new Text(news.getTitle());
                title.setWrappingWidth(380);

                BorderPane bpFooter = new BorderPane();

                DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
                Text sDate;
                if (news.getDate() != null)
                    sDate = new Text(dateFormat.format(news.getDate()));
                else
                    sDate = new Text("");
                sDate.setFill(Color.web("#A12568"));

                Image imgLogo;
                switch (news.getBrand()) {
                    case "Nguoi Lao Dong":
                        imgLogo = new Image(Main.class.getResource("images/logo_nguoilaodong.jpg").toString());
                        break;
                    case "Thanh Nien":
                        imgLogo = new Image(Main.class.getResource("images/logo_thanhnien.png").toString());
                        break;
                    case "Tuoi Tre":
                        imgLogo = new Image(Main.class.getResource("images/logo_tuoitre.png").toString());
                        break;
                    case "VnExpress":
                        imgLogo = new Image(Main.class.getResource("images/logo_vnexpress.png").toString());
                        break;
                    case "VTC News":
                        imgLogo = new Image(Main.class.getResource("images/logo_vtc.png").toString());
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + news.getBrand());
                }

                ImageView imgViewLogo = new ImageView();
                imgViewLogo.setImage(imgLogo);
                imgViewLogo.setFitHeight(30);
                imgViewLogo.setFitWidth(60);

                bpFooter.setLeft(sDate);
                BorderPane.setAlignment(sDate, Pos.CENTER_LEFT);
                bpFooter.setRight(imgViewLogo);
                BorderPane.setAlignment(imgViewLogo, Pos.CENTER_RIGHT);

                vBox.getChildren().addAll(imgView, title, bpFooter);
                hbLine.getChildren().add(vBox);

                if ((++i) >= 4) {
                    hbLine = new HBox();
                    hbLine.setPadding(new Insets(15, 15, 15, 15));
                    hbLine.setSpacing(10);
                    svCategory.getChildren().add(hbLine);
                    i = 0;
                }

                if(news.getBrand().equals("VnExpress") && temp == 1)
                {
                    temp = 0;
                    break;
                }

                if((++temp) >= 10) {
                    temp = 0;
                    break;
                }
            }
        }
    }
}