package org.example.lesson2.homework.task2;

public class Task2 {
    public static void main(String[] args) {
        //Задача №2
        //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
        //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.
        MyList<Boolean> integerMyList = new MyList<>();
        integerMyList.add(true);
        integerMyList.add(true);
        integerMyList.add(false);
        integerMyList.add(true);


    }
}
