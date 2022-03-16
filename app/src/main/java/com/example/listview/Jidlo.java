package com.example.listview;

public class Jidlo {
    String nazev;
    String recept;

    public Jidlo(String nazev) {
        this.nazev = nazev;
        this.recept = "...";
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
}