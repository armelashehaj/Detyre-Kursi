package com.example.detyrekursijava;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Artikull extends Application {
    public int id;
    public String emer;
    public    double cmimi;
    public int sasia;

    public Artikull(int id,String emer, double cmimi) {
        this.id = id;
        this.emer = emer;
        this.cmimi = cmimi;
    }

    public Artikull setSasia(int sasia)
    {
        this.sasia = sasia;
        return this;
    }
    public int getSasia()
    {
        return this.sasia;
    }
    public ArrayList<Artikull> tePerzgjedhurat = new ArrayList<>();
    public  Artikull setTePerzgjedhurat(){
        this.tePerzgjedhurat = tePerzgjedhurat;
        return this;
    }

    @Override
    public void start(Stage stage) {
    }
    public void setText(String text) {
    }
    public void setOnAction(Object onAction) {
    }
}
