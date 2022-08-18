package org.example.lesson1;

import org.example.lesson1.computer.*;
import org.example.lesson1.store.*;

public class Lesson1 {

    public static void main(String[] args) {
        //Задача - создать класс, который будет хранить в себе товар определенной категории

        //Без дженериков
        //Создали вилку
        Fork fork = new Fork(200);
        //Для хранения только вилок, нам пришлось создать класс ForkStore
        ForkStore forkStore = new ForkStore(fork);
        //Получили вилку из магазина
        Fork fork1 = forkStore.getFork();

        //Создали водку
        Vodka vodka = new Vodka(300);
        //Для хранения водки, нам пришлось создать класс VodkaStore
        VodkaStore vodkaStore = new VodkaStore(vodka);
        //Получили вилку из магазина
        Vodka vodka1 = vodkaStore.getVodka();

        //А что если мы захотим воспользоваться полиморфизмом, и создать универсальный магазин?
        //Абстрактный магазин принимает в себя любой экземпляр класса Object
        AbstractStore abstractStore = new AbstractStore(fork);
        Object object = abstractStore.getObject();

        //И теперь нам нужно будет каждый объект проверять на принадлежность его к классу
        //Не очень удобно если товаров будет много (придется писать много if)
        if (object instanceof Fork) {
            Fork fork2 = (Fork) object;
            fork2.fall();
        }

        //С использованием generics
        //Создаем новую вилку
        Fork fork3 = new Fork(100);
        //Создаем объект класса GenericStore и передаем туда аргумент.
        //У этого переменной fork3 - тип данных Fork, и GenericStore становится магазином вилок
        //Как это понять - GenericStore<Fork> - здесь указан тип, который теперь будет вместо <T> в классе GenericStore
        GenericStore<Fork> store = new GenericStore<>(fork3);
        //getGood - теперь возвращает объекты класса Fork
        Fork good = store.getGood();

        Vodka vodka2 = new Vodka(300);
        //Создавая магазин и передавая туда переменную типа Vodka, новый магазин становится магазином водки
        GenericStore<Vodka> vodkaGenericStore = new GenericStore<>(vodka2);


        //Мы можем создать экземпляр класса GenericStore, не передавая аргументы. Но тогда нам придется самим ставить
        //Типы в <> (иначе будет подставляться Object)
        GenericStoreTwice<Fork, Vodka> store2 = new GenericStoreTwice<>();
        store2.setGood2(vodka2);


        //Пример использования статического метода с Generics
        Object obj = new Vodka(200);

        Vodka vodka3 = GenericStore.castToType(obj, Vodka.class);
        vodka3.smell();

        //___________________________________________________
        //Другой пример:
        //Представим что у нас есть компьютер, у которого есть устройство ввода информации - Input
        // и устройство Вывода - Output
        //Устройства ввода информации: Keyboard, Mouse. У них разные методы, поэтому полиморфизм не подойдет.
        //Устройства вывода информации: Tv, Monitor. У них разные методы, поэтому полиморфизм не подойдет.

        //Создадим первый компьютер с мышью и монитором
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Computer<Mouse, Monitor> computer = new Computer<>(mouse, monitor);

        //Действия с мышью
        computer.getInput().move();
        //Действия с монитором
        computer.getOutput().show();

        //Создадим второй компьютер с клавиатурой и телевизором
        Keyboard keyboard = new Keyboard();
        Tv tv = new Tv();
        Computer<Keyboard, Tv> computer2 = new Computer<>(keyboard, tv);

        //Действия с клавиатурой
        computer2.getInput().press();
        //Действия с телевизором
        computer2.getOutput().tvShow();

    }
}
