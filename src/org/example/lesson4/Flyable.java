package org.example.lesson4;

public interface Flyable {
    void fly();

//    int add(int e);

    default void fly2() {
        System.out.println("");
    }
}
