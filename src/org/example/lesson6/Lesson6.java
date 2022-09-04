package org.example.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson6 {
    public static void main(String[] args) {
        //{1, 2, 3}
        //{
        // 1: "Petr",
        // 2: "Yuri"
        // }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Vasya");
//        Integer integer = new Integer(2);
//        integer.getClass();
//        int i = 1;
//        i.getClass(); - невозможно вызвать

        HashMap<String, HashMap<Integer, String>> hashMap = new HashMap<>();
        HashMap<Integer, String> group6202e = new HashMap<>();
        group6202e.put(12333, "Петров Иван Иванович");
        group6202e.put(12334, "Чалова Ирина Анатольевна");

        HashMap<Integer, String> group6203e = new HashMap<>();
        group6203e.put(12335, "Иванов Иван Иванович");
        group6203e.put(12336, "Мирских Ирина Анатольевна");

        hashMap.put("6202e", group6202e);
        hashMap.put("6203e", group6203e);

        //get - получение по ключу
        System.out.println(hashMap.get("6202e"));

        //containsKey - содержит ли ключ
        System.out.println(hashMap.containsKey("6202e"));

        //0 - 10
        //int[] numbers = {null, null ...}
        //numbers[0] = 10;
        //{10, null, null ...}
        //лучшее время - O(1)
        //среднее время - O(n)
        //худшее время - O(n)

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "hello");
        map2.put(2, "hello");
        map2.put(2, "hi");
        map2.put(3, "hi");
        map2.put(4, "hi");
        map2.put(45, "hi");
        map2.put(39, "hi");
        map2.put(104, "hi");
        map2.put(125, "hi");
        map2.put(124, "hi");

        System.out.println(map2);
        boolean containsValue = map2.containsValue("hi");

        //Хотим перебрать мапу!
        map2.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        //Хотим перебрать все ключи!
        map2.keySet().stream()
                .forEach(e -> System.out.println(e));

        //Хотим перебрать все значение
        map2.values().stream()
                .forEach(e -> System.out.println(e));

        String yuri = map2.getOrDefault(46, "Yuri");

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Petr", 10);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                map1.put("Petr", map1.getOrDefault("Petr", 0) + 1);

            }
        }
        System.out.println(map1);
        map1.forEach((a, b) -> System.out.println(a + " " + b));

        //Есть ли внутри мапы значения или нет
        map1.isEmpty();

        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("Yuri", 20);
        map1.putAll(map3);
        System.out.println(map1);
        List<Integer> integers = List.of(5, 6, 7, 1, 2, 3, 3, 2);
        List<Integer> unique = new ArrayList<>(new HashSet<>(integers));
        System.out.println(unique);


        //Расширение бакетов в мапе
        // [ 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8]  - больше в 8 элементов в бакете
        // [1 2 3 null 5 6 ... 16] - количество заполненных бакетов 75% и более
        // Увеличение бакетов на 1.75

        //Если бакетов 64 и более
        //То после появления 8 элементов внутри бакета, бакет преобразуется в красно-черное дерево

        HashSet<String> strings = new HashSet<>();
        strings.add("Petr");
        strings.add("Yuri");
        strings.add("Petr");


    }
}
