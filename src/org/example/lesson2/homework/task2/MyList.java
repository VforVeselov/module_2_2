package org.example.lesson2.homework.task2;

public class MyList<T> {
    //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
    //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
    //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
    //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
    //2.Скопировать со старого массива все значения в новый
    //3.Присвоить экземпляру MyList новый массив.
    private T[] objects = (T[]) new Object[3];
    private int size;

    public void add(T element) {
        if (objects.length == size) {
            T[] newObjects = (T[]) new Object[objects.length * 2];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            this.objects = newObjects;
        }
        objects[size] = element;
        size++;
    }

    public T[] getObjects() {
        return objects;
    }

    @Override
    public String toString() {
        String result = "";
        for (T object : objects) {
            if (object != null) {
                result += object.toString() + " ";
            }
        }
        result = result.substring(0, result.length() - 1);
        return "MyList{" + result + "}";
    }
}
