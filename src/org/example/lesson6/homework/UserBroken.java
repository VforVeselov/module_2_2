package org.example.lesson6.homework;

public class UserBroken {
    private int age;
    private String name;

    public UserBroken(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "UserBroken{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
