package org.example.lesson1.store;

public class VodkaStore {
    private Vodka vodka;

    public VodkaStore(Vodka vodka) {
        this.vodka = vodka;
    }

    public Vodka getVodka() {
        return vodka;
    }

    public void setVodka(Vodka vodka) {
        this.vodka = vodka;
    }
}
