package com.example.detyrekursijava;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController  extends Application {
        @FXML
    private Label label;

    @FXML
    private Hyperlink merrMeVete;

    private ArrayList<Artikull> tePerzgjedhurat = new ArrayList<>(10);
    @FXML
    protected void tabMenu(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Node node = (Node) event.getSource() ;
        String menuName = (String) node.getUserData();
        if(merrMeVete.isVisited()){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource
                    ("fature.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setScene(scene);
        }
        stage.setTitle(menuName);
              stage.show();
    }
    /*Per tabin dreke */
    @FXML
    CheckBox dreke1 = new CheckBox();
    @FXML
    CheckBox dreke2 = new CheckBox();
    @FXML
    CheckBox dreke3 = new CheckBox();
    @FXML
    CheckBox dreke4 = new CheckBox();
    @FXML
    CheckBox dreke5 = new CheckBox();
    @FXML
    CheckBox dreke6 = new CheckBox();
    @FXML
    TextField adreke1 = new TextField();
    @FXML
    TextField adreke2 = new TextField();
    @FXML
    TextField adreke3 = new TextField();
    @FXML
    TextField adreke4 = new TextField();
    @FXML
    TextField adreke5 = new TextField();
    @FXML
    TextField adreke6 = new TextField();
    @FXML
    Button gjeneroFature = new Button();
    private ArrayList<Artikull> artikujDreke= new ArrayList<>();
    public void setArtikujDreke(){
        this.artikujDreke.add(new Artikull(1, "Supe Krem pule", 450.0));
        this.artikujDreke.add(new Artikull(2, "Supe Krem Brokoli", 400.0));
        this.artikujDreke.add(new Artikull(3, "Fileto Pule", 550.0));
        this.artikujDreke.add(new Artikull(4, "Shishqebap pule", 500.0));
        this.artikujDreke.add(new Artikull(5, "Oriz i skuqur me perime", 320.0));
        this.artikujDreke.add(new Artikull(6, "Oriz i skuqur me pule", 200.0));
    }
     ArrayList<Integer> sasia = new ArrayList<>(artikujDreke.size());
    @FXML
    protected void kontrolliIChekimeveDreke(ActionEvent event) throws IOException{
        int sasia = 0;
        setArtikujDreke();
        if(this.dreke1.isSelected()){
            sasia = Integer.parseInt(adreke1.getText());
            this.sasia.add( sasia);
            this.tePerzgjedhurat.add(this.artikujDreke.get(0).setSasia(sasia));
            System.out.println(tePerzgjedhurat.get(0).emer + tePerzgjedhurat.get(0).cmimi);
        }
        if(this.dreke2.isSelected()){
            sasia = Integer.parseInt(adreke2.getText());
            this.sasia.add( sasia);
            this.tePerzgjedhurat.add(this.artikujDreke.get(1).setSasia(sasia));
            System.out.println(tePerzgjedhurat.get(1).emer);
        }
       if(dreke3.isSelected()){
           sasia = Integer.parseInt(adreke3.getText());
           System.out.println("Gjatesia e te perzgjedhura  " + tePerzgjedhurat.size());
           this.sasia.add( sasia);
           this.tePerzgjedhurat.add(this.artikujDreke.get(2).setSasia(sasia));
           System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if(dreke4.isSelected()){
            sasia = Integer.parseInt(adreke4.getText());
            this.sasia.add( sasia);
            this.tePerzgjedhurat.add(this.artikujDreke.get(3).setSasia(sasia));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if(dreke5.isSelected()){
            sasia = Integer.parseInt(adreke1.getText());
            this.sasia.add( sasia);
            this.tePerzgjedhurat.add(this.artikujDreke.get(4).setSasia(sasia));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if(dreke6.isSelected()){
            sasia = Integer.parseInt(adreke6.getText());
            this.sasia.add( sasia);
            this.tePerzgjedhurat.add(this.artikujDreke.get(5).setSasia(sasia));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
    }

    /*per tabin mengjes*/
    @FXML
    CheckBox mengjes1 = new CheckBox();
    @FXML
    CheckBox mengjes2 = new CheckBox();
    @FXML
    CheckBox mengjes3 = new CheckBox();
    @FXML
    CheckBox mengjes4 = new CheckBox();
    @FXML
    CheckBox mengjes5 = new CheckBox();
    @FXML
    CheckBox mengjes6 = new CheckBox();
    @FXML
    TextField amengjes1 = new TextField();
    @FXML
    TextField amengjes2 = new TextField();
    @FXML
    TextField amengjes3 = new TextField();
    @FXML
    TextField amengjes4 = new TextField();
    @FXML
    TextField amengjes5 = new TextField();
    @FXML
    TextField amengjes6 = new TextField();

    private ArrayList<Artikull> artikujMengjes = new ArrayList<>();

    public void setArtikujMengjes(){
        this.artikujMengjes.add(new Artikull(1, "Omlete Fshati", 220.0));
        this.artikujMengjes.add(new Artikull(2, "Omlete Franceze", 250.0));
        this.artikujMengjes.add(new Artikull(3, "Veze Benedikt", 400.0));
        this.artikujMengjes.add(new Artikull(4, "Petullat e gjyshes", 280.0));
        this.artikujMengjes.add(new Artikull(5, "Buke me veze", 300.0));
       this.artikujMengjes.add(new Artikull(6, "Veze sy", 200.0));
    }

    @FXML
    protected void kontrolliIChekimeveMengjes(){
        int sasia = 0 ;
        setArtikujMengjes();
        if (mengjes1.isSelected()){
            sasia = Integer.parseInt(amengjes1.getText());
            this.sasia.add(sasia);
           this.tePerzgjedhurat.add(this.artikujMengjes.get(0));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (mengjes2.isSelected()){
            sasia = Integer.parseInt(amengjes2.getText());
            this.sasia.add(sasia);
            this.tePerzgjedhurat.add(this.artikujMengjes.get(1));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (mengjes3.isSelected()){
            sasia = Integer.parseInt(amengjes3.getText());
            this.sasia.add(sasia);
            this.tePerzgjedhurat.add(this.artikujMengjes.get(2));
            System.out.println(tePerzgjedhurat.get(0).emer);
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (mengjes4.isSelected()){
            sasia = Integer.parseInt(amengjes4.getText());
            this.sasia.add(sasia);
            this.tePerzgjedhurat.add(this.artikujMengjes.get(3));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (mengjes5.isSelected()){
            sasia = Integer.parseInt(amengjes5.getText());
            this.sasia.add(sasia);
            this.tePerzgjedhurat.add(this.artikujMengjes.get(4));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (mengjes6.isSelected()){
            sasia = Integer.parseInt(amengjes6.getText());
            this.sasia.add(sasia);
            this.tePerzgjedhurat.add(this.artikujMengjes.get(5));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }

    }
    @FXML
    CheckBox pije1 = new CheckBox();
    @FXML
    CheckBox pije2 = new CheckBox();
    @FXML
    CheckBox pije3 = new CheckBox();
    @FXML
    CheckBox pije4 = new CheckBox();
    @FXML
    CheckBox pije5 = new CheckBox();
    @FXML
    CheckBox pije6 = new CheckBox();
    @FXML
    TextField apije1 = new TextField();
    @FXML
    TextField apije2 = new TextField();
    @FXML
    TextField apije3 = new TextField();
    @FXML
    TextField apije4 = new TextField();
    @FXML
    TextField apije5 = new TextField();
    @FXML
    TextField apije6 = new TextField();
    private ArrayList<Artikull> artikujPije = new ArrayList<>();

    public void setArtikujPije(){
        this.artikujPije.add(new Artikull(1, "Kakao", 350.0));
        this.artikujPije.add(new Artikull(2, "Vanilla Frappe Coconout", 250.0));
        this.artikujPije.add(new Artikull(3, "Fredo Caffe", 150.0));
        this.artikujPije.add(new Artikull(4, "Orange Milkshake", 170.0));
        this.artikujPije.add(new Artikull(5, "Apple Mint Nojito", 260.0));
        this.artikujPije.add(new Artikull(6, "Kiwi Smoothie", 320.0));
    }

    @FXML
    protected void kontrolliIChekimevePije(){
        int sasia = 0 ;
        setArtikujPije();
        if(pije1.isSelected()){
            sasia = Integer.parseInt(apije1.getText());
            this.sasia.add(sasia);
            tePerzgjedhurat.add(artikujPije.get(0));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (pije2.isSelected()){
            sasia = Integer.parseInt(apije2.getText());
            this.sasia.add(sasia);
            tePerzgjedhurat.add(this.artikujPije.get(1));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if(pije3.isSelected()){
            sasia = Integer.parseInt(apije3.getText());
            this.sasia.add(sasia);
            tePerzgjedhurat.add(this.artikujPije.get(2));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (pije4.isSelected()){
            sasia = Integer.parseInt(apije4.getText());
            this.sasia.add(sasia);
            tePerzgjedhurat.add(this.artikujPije.get(3));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if(pije5.isSelected()){
            sasia = Integer.parseInt(apije5.getText());
            this.sasia.add(sasia);
            tePerzgjedhurat.add(this.artikujPije.get(4));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }
        if (pije6.isSelected()){
            sasia = Integer.parseInt(apije6.getText());
            this.sasia.add(sasia);
            tePerzgjedhurat.add(this.artikujPije.get(5));
            System.out.println(tePerzgjedhurat.get(0).emer);
        }

    }

     @Override
    public void start(Stage stage) throws Exception {

    }
    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @FXML
    Button butonTest = new Button();
    @FXML
    Text textTest = new Text();
    @FXML
    VBox vendodhje = new VBox();
    //    @FXML
  //  ListView<Artikull> listaEPerzgjedhur = new ListView<>((ObservableList<Artikull>) tePerzgjedhurat);
    public void ndrysho() {
        textTest.setText("tePerzgjedhurat.get(0).emer\n");
      //  textTest.setText(tePerzgjedhurat.get(0).emer + "une jam vazhdimi");
      //  textTest.setText(artikujMengjes.get(0).emer + "mengesi");
        textTest.setText(this.tePerzgjedhurat.get(0).emer);
    }

}