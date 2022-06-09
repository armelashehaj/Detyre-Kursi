package com.example.detyrekursijava;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class Aplikacioni extends Application {
        @Override
        /*Stage e menuse kryesore*/
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    Aplikacioni.class.getResource("tab-perzgjedhes.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 800);
            stage.setTitle("Mulliri i Vjeter ");
            stage.setScene(scene);
            stage.show();
        }
        @FXML
        Hyperlink mengjes = new Hyperlink("Menu Mengjesi ");
        @FXML
        Hyperlink dreke = new Hyperlink("Menu Dreke");
        @FXML
        Hyperlink pijet = new Hyperlink("Pije");

        @FXML
        private void kontrolliILinkeve(ActionEvent event) throws IOException{
            Stage stage = new Stage();
            Node node = (Node) event.getSource();
            String menuName = (String) node.getUserData();
            if(mengjes.isVisited()) {
                FXMLLoader fxmlLoader = new FXMLLoader(kontrolliKryesor.class.getResource
                        ("menu-mengjes.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 1250, 400);
                stage.setScene(scene);
                stage.setTitle(menuName);
            }
            if (dreke.isVisited()){
                FXMLLoader fxmlLoader = new FXMLLoader(kontrolliKryesor.class.getResource
                        ("menu-dreke.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 1250, 400);
                stage.setScene(scene);
                stage.setTitle(menuName);
            }
            if (pijet.isVisited()){
                FXMLLoader fxmlLoader = new FXMLLoader(kontrolliKryesor.class.getResource
                        ("menu-pije.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 1250,  400);
                stage.setScene(scene);
                stage.setTitle(menuName);
            }
            stage.show();
        }
        public static void main(String[] args) {
            launch();
        }
    }

