package org.example.lesson2.homework;

import java.util.Arrays;

public class MyList<T> {
    private T[] objects;
    private int size;

    public MyList() {
        this.objects = (T[]) new Object[3];
        //this.size = objects.length;
        //System.out.println(objects.length);
    }

    public void add(T element) {
        if (size == this.objects.length) {
            T[] newArray = (T[]) new Object[objects.length * 2];
            for (int i = 0; i < this.objects.length; i++) {
                newArray[i] = this.objects[i];
            }
            this.objects = newArray;
        }

        for (int i = 0; i < this.objects.length; i++) {
            if (this.objects[i] == null) {
                this.objects[i] = element;
                    break;
            }
        }
        this.size++;
        System.out.println(Arrays.toString(this.objects));
    }

    public T[] getObjects() {
        return objects;
    }

    public void setObjects(T[] objects) {
        this.objects = objects;
    }
}
