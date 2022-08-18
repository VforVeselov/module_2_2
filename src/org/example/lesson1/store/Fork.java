package org.example.lesson1.store;

public class Fork extends Good {

    public Fork(double price) {
        super(price);
    }

    public void fall() {
        System.out.println("Вилка падает");
    }
}
