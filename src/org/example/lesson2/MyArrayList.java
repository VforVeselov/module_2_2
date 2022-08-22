package org.example.lesson2;

import java.util.Arrays;


/**
 * Создание листа 
 */
public class MyArrayList {
    private Integer[] integers = new Integer[3];
    private int size = 0;

    public MyArrayList() {
    }

    public boolean add(Integer number) {

        //[1, 2, 3, null, null, null] - integers
        if (size == integers.length) {
            Integer[] newArray = new Integer[integers.length * 2];
            for (int i = 0; i < integers.length; i++) {
                newArray[i] = integers[i];
            }
            this.integers = newArray;
        }

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == null) {
                integers[i] = number;
                break;
            }
        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "integers=" + Arrays.toString(integers) +
                '}';
    }
}
