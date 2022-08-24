package org.example.lesson2.homework;

public class HomeWork {
    public static void main(String[] args) {
        flyingAnimal bird = new flyingAnimal();
        flyingAnimal hedgehog = new flyingAnimal();

        swimingAnimal fish = new swimingAnimal();
        swimingAnimal dolphin = new swimingAnimal();

        bitingAnimal leo = new bitingAnimal();
        bitingAnimal mosquito = new bitingAnimal();

        Zoo<Bitable, Flyable, Swimable> zoo1 = new Zoo(leo,bird,fish);
        Zoo<Bitable, Flyable, Swimable> zoo2 = new Zoo(mosquito,hedgehog,dolphin);

        zoo1.getBite().bite();
        zoo1.getFly().fly();
        zoo1.getSwim().swim();

        zoo2.getBite().bite();
        zoo2.getFly().fly();
        zoo2.getSwim().swim();

        ////////////////////
        //
        //
        MyList<Number> list = new MyList<>();
        list.add(5);
        list.add(51);
        list.add(51);
        list.add(51.9);


    }
}
