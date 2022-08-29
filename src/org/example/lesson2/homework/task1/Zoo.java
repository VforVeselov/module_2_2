package org.example.lesson2.homework.task1;

public class Zoo <F extends Flyable, B extends Bitable, S extends Swimable>{
    private F flyable;
    private B bitable;
    private S swimable;

    public Zoo() {
    }

    public Zoo(F flyable, B bitable, S swimable) {
        this.flyable = flyable;
        this.bitable = bitable;
        this.swimable = swimable;
    }

    public void feedFlyable() {
        System.out.println("Летающее животное ест");
        flyable.fly();
    }

    public void feedSwimable() {
        System.out.println("Плавающие животное ест");
        swimable.swim();
    }

    public void feedBitable() {
        System.out.println("Кусающее животное ест");
        bitable.bite();
    }

    public void setFlyable(F flyable) {
        this.flyable = flyable;
    }

    public void setBitable(B bitable) {
        this.bitable = bitable;
    }

    public void setSwimable(S swimable) {
        this.swimable = swimable;
    }

    public F getFlyable() {
        return flyable;
    }

    public B getBitable() {
        return bitable;
    }

    public S getSwimable() {
        return swimable;
    }
}
