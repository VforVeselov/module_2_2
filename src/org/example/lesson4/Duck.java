package org.example.lesson4;

public class Duck implements Flyable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    public void some(){
        System.out.println("hi");
    }
}
