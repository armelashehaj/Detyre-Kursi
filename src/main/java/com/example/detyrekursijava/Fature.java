package com.example.detyrekursijava;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Fature  extends  Artikull{
    public ArrayList<Artikull> tePerzgjedhurat = new ArrayList<>();
    ArrayList<Integer> sasia = new ArrayList<>(tePerzgjedhurat.size());



    public Fature(int id, String emer, double cmimi) {
        super(id, emer, cmimi);
    }
}

