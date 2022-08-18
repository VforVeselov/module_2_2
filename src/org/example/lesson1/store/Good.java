package org.example.lesson1.store;

public abstract class Good {
    private double price;

    public Good(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
