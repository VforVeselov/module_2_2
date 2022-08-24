package org.example.lesson3;

import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {
        //ArrayList - хранение в ArrayList происходит через массив
        //[1 2 3 4 5]
        //[1 2 3 4 5 null null ] - когда есть место на вставку элементов (размер массива 7, но элементов в нем 5)

        //LinkedList
        //0 -> 1 -> 1.5 -> 2 -> 3 - хранение в LinkedList происходит через Класс Node.
        // У класса Node есть 3 атрибута - value, prev и next. Prev и next хранят ссылку на предыдущий и следующий
        // объект соответственно. Value - элемент который вы передали в лист.

        ArrayList<Object> list = new ArrayList<>(300_000);
        LinkedList<Object> linkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            linkedList.add(i);
            //list.add(i);
        }

        //Эксперимент со вставкой в LinkedList 3_000_000 элементов (в 5 индекс массива) - 600 мс
        //Если сделать тоже самое с ArrayList - можно приходить к компьютеру на следующий день
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 3_000_000; i++) {
//            linkedList.add(5, i);
//        }
//
//        System.out.println(linkedList.size());
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


        //Так как LinkedList реализует интерфейсы Deque и Queue - то доступны действия как с очередями
        //Вставка в начало листа
        linkedList.push(-1);
        //Тоже самое
        linkedList.addFirst(-2);

        //Просто читает первый элемент листа
        Object peek1 = linkedList.peek();
        //Тоже самое
        Object first = linkedList.getFirst();
        System.out.println(peek1);
        //Читает последний элемент листа
        Object o = linkedList.peekLast();

        //Вырезает первый элемент из листа и отдает его
        Object poll = linkedList.poll();
        System.out.println(poll);
        //Вырезает последний элемент листа и отдает его
        Object pollLast = linkedList.pollLast();

        //Итог наших действий
        System.out.println(linkedList);

        //Set - набор уникальных значений
        //Одна из реализаций HashSet. В основе HashSet лежит массив (по умолчанию длина 16).
        //В этот массив происходит распределение по принципу: вызов hashCode объекта, получение int,
        //деление на остаток - 1 (первая ячейка массива зарезервирована под null). Дальше происходит создание связанного
        //списка в ячейке под номером hashcode % (размер массива) - 1. При вставке второго элемента, в ту же ячейку
        //происходит сначала проверка: эти объекты равны или нет? Если равны (сравнение через метод equals),
        //то вставка второго элемента не происходит. Если объекты не равны:
        //то происходит запись элемента в next класса Node.
        //4 % 15 = 4
        //19 % 15 = 4

        //[null null null Node(value = 911, next = new Node(2,null)) ... null] - Размерность 16

        //HashSet - хранение происходит не в порядке вставки!
        HashSet<Integer> integers = new HashSet<>();
        integers.add(new Integer(911).hashCode());
        integers.add(2);
        integers.add(112);
        integers.add(911);
        integers.contains(2);
        System.out.println(integers);

        //LinkedHashSet - хранение происходит в порядке вставки, но увеличивается расход памяти.
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Integer(911).hashCode());
        linkedHashSet.add(2);
        linkedHashSet.add(112);
        System.out.println(linkedHashSet);

        //TreeSet - отсортированный сет. При каждой вставке происходит сортировка.
        //Хранение происходит в виде красно черного дерева.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(911);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(5);

        System.out.println(treeSet);
    }
}
