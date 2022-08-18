package org.example.lesson1.store;

public class Vodka extends Good {

    public Vodka(double price) {
        super(price);
    }

    public void smell() {
        System.out.println("Водка пахнет");
    }
}
