package org.example.lesson2.homework;

public class Zoo <B extends Bitable, F extends Flyable, S extends Swimable>{
    private B bite;
    private F fly;
    private S swim;

    public Zoo(B bite, F fly, S swim) {
        this.bite = bite;
        this.fly = fly;
        this.swim = swim;
    }


    public void feedFlyable(F animal) {
        animal.fly();
    }

    public void feedSwimable(S animal) {
        animal.swim();
    }

    public void feedBitable(B animal) {
        animal.bite();
    }
    public B getBite() {
        return bite;
    }

    public void setBite(B bite) {
        this.bite = bite;
    }

    public F getFly() {
        return fly;
    }

    public void setFly(F fly) {
        this.fly = fly;
    }

    public S getSwim() {
        return swim;
    }

    public void setSwim(S swim) {
        this.swim = swim;
    }
}
