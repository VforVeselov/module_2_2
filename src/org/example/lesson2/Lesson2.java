package org.example.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(3);

        //Итератор
        Iterator<Integer> iterator = integers.iterator();
        //Наличие следующего элемента
        System.out.println(iterator.hasNext());
        //Получение следующего элемента
        Integer number = iterator.next();
        System.out.println(number);

        //Удаление элемента
        Object o = (Integer) 3;
        boolean remove = integers.remove(o);
        System.out.println(integers);

//        ArrayList<Integer> newArrayList = new ArrayList<>(integers);
//        ArrayList<Integer> newArrayList2 = integers;
//        integers.clear();
//        System.out.println(integers);
//        System.out.println(newArrayList2);
//        System.out.println(newArrayList);

        //Частота элементов
        int frequency = Collections.frequency(integers, 3);
        //System.out.println(frequency);

        Integer[] integers2 = {1,2,3,4,5};
        Collections.addAll(integers, integers2);
        System.out.println(integers);

        String join = join("Юра", "привет", "как дела");
        System.out.println(join);
    }


    public static void print(Integer something, Integer... integers) {
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }

    public static String join(String... strings) {
        String result = "";
        for (String string : strings) {
            result += string + " ";
        }
        return result;
    }
}
