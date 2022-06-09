package com.example.detyrekursijava;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import java.io.File;
import java.io.IOException;

import javafx.stage.Stage;

import java.io.*;

public class kontrolliKryesor extends Application {

    public kontrolliKryesor() throws IOException {
    }

    public void start(Stage stage) throws IOException {

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
    /*Per tabin Pije*/
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
    @FXML
    Button porosiOnline = new Button();
    @FXML
    ListView listView;
    @FXML
    CheckBox zona1 = new CheckBox();
    @FXML
    CheckBox zona2 = new CheckBox("zona 2");
    @FXML
    ListView<Artikull> listaEPijeve = new ListView<>();
    @FXML
    TextField emer = new TextField();
    @FXML
    TextField mbiemer = new TextField();
    @FXML
    TextField nrTel = new TextField();
    @FXML
    Button perfundo = new Button("Perfundova");

    File FaturaJuaj = new File("Fatura.txt");
    FileWriter shkruajNeFature = new FileWriter("Fatura.txt");
     private ObservableList<Artikull> artikujMengjes =FXCollections.observableArrayList();

    public void setArtikujMengjes() {
        this.artikujMengjes.add(new Artikull( 1001, "Omlete Fshati", 220.0));
        this.artikujMengjes.add(new Artikull(1002, "Omlete Franceze", 250.0));
        this.artikujMengjes.add(new Artikull(1003, "Veze Benedikt", 400.0));
        this.artikujMengjes.add(new Artikull(1004, "Petullat e gjyshes", 280.0));
        this.artikujMengjes.add(new Artikull(1005, "Buke me veze", 300.0));
        this.artikujMengjes.add(new Artikull(1006, "Veze sy", 200.0));
    }
    @FXML
    protected void kontrolliIChekimeveMengjes() {
        int sasia = 0;
        setArtikujMengjes();
        if (mengjes1.isSelected()) {
            sasia = Integer.parseInt(amengjes1.getText());
            this.tePerzgjedhurat.add(this.artikujMengjes.get(0).setSasia(sasia));
        }
        if (mengjes2.isSelected()) {
            sasia = Integer.parseInt(amengjes2.getText());
            this.tePerzgjedhurat.add(this.artikujMengjes.get(1).setSasia(sasia));
        }
        if (mengjes3.isSelected()) {
            sasia = Integer.parseInt(amengjes3.getText());
            this.tePerzgjedhurat.add(this.artikujMengjes.get(2).setSasia(sasia));
        }
        if (mengjes4.isSelected()) {
            sasia = Integer.parseInt(amengjes4.getText());
            this.tePerzgjedhurat.add(this.artikujMengjes.get(3).setSasia(sasia));
        }
        if (mengjes5.isSelected()) {
            sasia = Integer.parseInt(amengjes5.getText());
            this.tePerzgjedhurat.add(this.artikujMengjes.get(4).setSasia(sasia));
        }
        if (mengjes6.isSelected()) {
            sasia = Integer.parseInt(amengjes6.getText());
            this.tePerzgjedhurat.add(this.artikujMengjes.get(5).setSasia(sasia));
        }
    }

    private ObservableList<Artikull> artikujDreke = FXCollections.observableArrayList();
    public void setArtikujDreke() {
        this.artikujDreke.add(new Artikull(2001, "Supe Krem pule", 450.0));
        this.artikujDreke.add(new Artikull(2002, "Supe Krem Brokoli", 400.0));
        this.artikujDreke.add(new Artikull(2003, "Fileto Pule", 550.0));
        this.artikujDreke.add(new Artikull(2004, "Shishqebap pule", 500.0));
        this.artikujDreke.add(new Artikull(2005, "Oriz i skuqur me perime", 320.0));
        this.artikujDreke.add(new Artikull(2006, "Oriz i skuqur me pule", 200.0));
    }
    @FXML
    protected void kontrolliIChekimeveDreke(ActionEvent event) throws IOException {
        int sasia = 0;
        setArtikujDreke();
        if (this.dreke1.isSelected()) {
            sasia = Integer.parseInt(adreke1.getText());
            this.tePerzgjedhurat.add(this.artikujDreke.get(0).setSasia(sasia));
        }
        if (this.dreke2.isSelected()) {
            sasia = Integer.parseInt(adreke2.getText());
            this.tePerzgjedhurat.add(this.artikujDreke.get(1).setSasia(sasia));
        }
        if (dreke3.isSelected()) {
            sasia = Integer.parseInt(adreke3.getText());
            this.tePerzgjedhurat.add(this.artikujDreke.get(2).setSasia(sasia));
        }
        if (dreke4.isSelected()) {
            sasia = Integer.parseInt(adreke4.getText());
            this.tePerzgjedhurat.add(this.artikujDreke.get(3).setSasia(sasia));
        }
        if (dreke5.isSelected()) {
            sasia = Integer.parseInt(adreke5.getText());
            this.tePerzgjedhurat.add(this.artikujDreke.get(4).setSasia(sasia));
        }
        if (dreke6.isSelected()) {
            sasia = Integer.parseInt(adreke6.getText());
            this.tePerzgjedhurat.add(this.artikujDreke.get(5).setSasia(sasia));
        }
    }
    private ObservableList<Artikull> artikujPije = FXCollections.observableArrayList();
    public void setArtikujPije() {
        this.artikujPije.add(new Artikull(3001, "Kakao", 350.0));
        this.artikujPije.add(new Artikull(3002, "Vanilla Frappe Coconout", 250.0));
        this.artikujPije.add(new Artikull(3003, "Fredo Caffe", 150.0));
        this.artikujPije.add(new Artikull(3004, "Orange Milkshake", 170.0));
        this.artikujPije.add(new Artikull(3005, "Apple Mint Nojito", 260.0));
        this.artikujPije.add(new Artikull(3006, "Kiwi Smoothie", 320.0));
    }
    @FXML
    protected void kontrolliIChekimevePije() {
        int sasia = 0;
        setArtikujPije();
        if (pije1.isSelected()) {
            sasia = Integer.parseInt(apije1.getText());
            this.tePerzgjedhurat.add(artikujPije.get(0).setSasia(sasia));
        }
        if (pije2.isSelected()) {
            sasia = Integer.parseInt(apije2.getText());
            this.tePerzgjedhurat.add(this.artikujPije.get(1).setSasia(sasia));
        }
        if (pije3.isSelected()) {
            sasia = Integer.parseInt(apije3.getText());
            this.tePerzgjedhurat.add(this.artikujPije.get(2).setSasia(sasia));
        }
        if (pije4.isSelected()) {
            sasia = Integer.parseInt(apije4.getText());
            this.tePerzgjedhurat.add(this.artikujPije.get(3).setSasia(sasia));
        }
        if (pije5.isSelected()) {
            sasia = Integer.parseInt(apije5.getText());
            this.tePerzgjedhurat.add(this.artikujPije.get(4).setSasia(sasia));
        }
        if (pije6.isSelected()) {
            sasia = Integer.parseInt(apije6.getText());
            this.tePerzgjedhurat.add(this.artikujPije.get(5).setSasia(sasia));
        }
    }
    private ObservableList<String> Menu = FXCollections.observableArrayList();
    private ObservableList<Artikull> tePerzgjedhurat = FXCollections.observableArrayList();
    public void initialize(ObservableList<String> EmerListe) {
        listView.setItems(EmerListe);
    }
    public void  inicializo(ObservableList<String> EmerListeString){
        listView.setItems(EmerListeString);
    }

    public static void main(String[] args) throws IOException {
        launch(args);
    }

    ObservableList<String> kopjeEListes = FXCollections.observableArrayList();
    ObservableList<Integer> kopjeUnikEId = FXCollections.observableArrayList();
/*
    public ObservableList<Integer> pastrimi(ObservableList<Artikull> tePerzgjedhurat ){

        int i = 0 ;
        this.kopjeUnikEId.add(this.tePerzgjedhurat.get(0).id);
        while(i < this.tePerzgjedhurat.size()){
            if (this.kopjeUnikEId.get(i-1) == this.tePerzgjedhurat.get(i).id){
                this.kopjeUnikEId.add(this.tePerzgjedhurat.get(i).id);
                i++;
            }
        }
        return kopjeUnikEId;
    }

*/
    private double shuma = 0;
    private String vlere = new String();

   @FXML
    private void shtoNeFature() throws IOException {
        this.kopjeEListes = FXCollections.observableArrayList();
        int i = 0 ;
     //   pastrimi(tePerzgjedhurat);
        this.kopjeEListes.add("Artikujt e porositur \t Sasia \t Cmimi \n");
        shkruajNeFature.write(this.kopjeEListes.get(0));
        while (i < this.tePerzgjedhurat.size()) {
            if (this.tePerzgjedhurat.get(i).sasia <= 0
                /* && this.kopjeUnikEId.get(i) != this.tePerzgjedhurat.get(i).id*/ ){
                i++;
            }
            else {
                        this.kopjeEListes.add(this.tePerzgjedhurat.get(i).id + ". " + this.tePerzgjedhurat.get(i).emer + "\t\t" +
                                this.tePerzgjedhurat.get(i).sasia + "\t\t\t" + this.tePerzgjedhurat.get(i).cmimi + "\n");
                        vlere = this.kopjeEListes.get(i+1);

                shuma += (this.tePerzgjedhurat.get(i).sasia * this.tePerzgjedhurat.get(i).cmimi);
            }
            i++;
            shkruajNeFature.write(vlere);
        }
     //   this.tePerzgjedhurat = FXCollections.observableArrayList();
       this.kopjeEListes.add("Per tu paguar : "+ shuma +" \n");
        shkruajNeFature.write("Per tu paguar : " + shuma);
        inicializo(kopjeEListes);
        shkruajNeFature.close();
    }
    public String zonaEZgjedhur ;
    public  double cmimiIDergeses ;
    public double cmimiIZones() {
        if(zona1.isSelected()){
            cmimiIDergeses = 500 ;
            zonaEZgjedhur = "zona 1";
        }
        if (zona2.isSelected()){
            cmimiIDergeses = 800;
            zonaEZgjedhur = "zona 2";
        }
        return  cmimiIDergeses;
    }
    public void faturaPerOnline(ActionEvent event) throws IOException {
        this.kopjeEListes.add("\n\nKjo Fature i drejtohet :");
        this.kopjeEListes.add("Emer : " + emer.getText());
        this.kopjeEListes.add("Mbiemer : " + mbiemer.getText());
        this.kopjeEListes.add("Numer telefoni : " + nrTel.getText());
        this.kopjeEListes.add("Zona e banimit : " + zonaEZgjedhur +"\n");
        this.kopjeEListes.add("\t\t\tFATURE TOTALE\n");
        this.kopjeEListes.add("Kosto transporti :" + String.valueOf(cmimiIZones()));
        this.kopjeEListes.add("Per tu Paguar :" + String.valueOf(cmimiIZones()));
        for (int i = 0 ; i < kopjeEListes.size() ; i++) {
            shkruajNeFature.write(kopjeEListes.get(i)+ "\n");
        }
        shkruajNeFature.close();
        inicializo(kopjeEListes);
    }
    @FXML
    protected void ndrysho(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Node node = (Node) event.getSource();
        String menuName = (String) node.getUserData();
        FXMLLoader fxmlLoader = new FXMLLoader(kontrolliKryesor.class.getResource
                ("per-dergesa.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 500);
        stage.setScene(scene);
        stage.setTitle("Fature Transporti");
        stage.show();
    }

}