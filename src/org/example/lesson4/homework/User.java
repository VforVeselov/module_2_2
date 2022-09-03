package org.example.lesson4.homework;

import java.util.List;

public class User {
    private int value;
    private List<Integer> integers;

    public User(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }
}
