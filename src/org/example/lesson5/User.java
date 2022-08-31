package org.example.lesson5;

public class User {

    public static void main(String[] args) {
        User user = new User();
        user.setWithAge(20).setWithName("hi");
    }
    private int age;
    private String name;

    public User() {
    }

    public User setWithAge(int age) {
        this.age = age;
        return this;
    }

    public User setWithName(String name) {
        this.name = name;
        return this;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
