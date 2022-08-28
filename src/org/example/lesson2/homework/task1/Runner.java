package org.example.lesson2.homework.task1;

public class Runner {
    public static void main(String[] args) {
        //Задача №1
        //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
        //Создать класс Zoo, который может содержать в себе 3-х вида животных
        //1. Животное плавающее
        //2. Животное летающее
        //3. Животное кусающее
        //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
        //а не интерфейсы.
        //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
        //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
        //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
        //Создать по одному экземпляру на каждый класс.
        //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
        //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Eagle eagle = new Eagle();
        Parrot parrot = new Parrot();
        Shark shark = new Shark();
        Fish fish = new Fish();
        Zoo<Eagle, Dog, Shark> zoo1 = new Zoo<>(eagle, dog, shark);
        Zoo<Parrot, Tiger, Fish> zoo2 = new Zoo<>();
        zoo2.setBitable(tiger);
        zoo2.setFlyable(parrot);
        zoo2.setSwimable(fish);
        zoo1.feedBitable();
        zoo1.feedFlyable();
        zoo1.feedSwimable();
    }
}
