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

    @Override
    public String toString() {
        String zkracenyRecept;
        if (recept.length() > 20){
            zkracenyRecept = recept.substring(0, 17) + "...";
        } else {
            zkracenyRecept = recept;
        }

        return nazev + "\n" + zkracenyRecept;
        //return nazev - zobrazí pouze název
        //return nazev + "\n" + recept; - zobrazí název i recept
    }
}