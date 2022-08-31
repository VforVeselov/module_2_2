package org.example.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson5 {
    public static void main(String[] args) {
        //Базовая коллекция
        List<Integer> integers = Arrays.asList(1, 5, 3, 4, 2, 2, 5, 7, 8, 9);

        //Промежуточные операции - это такие операции, которые не закрывают стрим,
        // т.е позволяют выполнять последующие команды, т.е возращают объект типа Stream
        Stream<Integer> mapStream = integers.stream().map(e -> e + 1);

        //filter - Фильтрация данных: если элемент удовлетворяет условию, то он остается в стриме
        Stream<Integer> filteredStream = mapStream.filter(e -> e > 3);

        //distinct - Удаление дубликатов
        Stream<Integer> distinctStream = filteredStream.distinct();

        //skip - пропуск первых N элементов
        Stream<Integer> skipStream = distinctStream.skip(2);

        //limit - выбор первых N элементов
        Stream<Integer> limitStream = skipStream.limit(2);

        //Сортировка элементов
        Stream<Integer> sortedStream = limitStream.sorted((a, b) -> a - b);

        //peek - Действие с объектом, без изменения его ссылки
        Stream<Integer> peekStream = sortedStream.peek(e -> System.out.println(e));

        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 4), Arrays.asList(3));
        //lists.stream().flatMap(e -> e.stream()).forEach(e -> System.out.println(e));

        //Терминальные операции - операции которые закрывают стрим (т.е. последующее обращение к стриму невозможно)
        //Делает последовательно набор действий. Не возвращает ничего
        //peekStream.forEach(System.out::println);

        //        (1, 5, 3, 4, 2, 2, 5, 7, 8, 9);
        //anyMatch - Хотя бы один элемент отвечает условию. Возвращает boolean
        boolean anyMatch = integers.stream().anyMatch(e -> e == 8);

        //allMatch - Все элементы отвечают условию. Возвращает boolean
        boolean allMatch = integers.stream().allMatch(e -> e == 8 || e == 3);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        Integer first = list.stream().findFirst().orElse(100);
        //System.out.println(first);

        //count - количество элементов стрима
        long count = list.stream().filter(e -> e == 2).count();

        List<Integer> integers2 = list.stream()
                .filter(e -> e == 2)
                .collect(Collectors.toList());

        //reduce - складывание в одно значение
        Integer reduce = integers.stream().reduce((a, b) -> a + b).orElse(0);
        System.out.println(reduce);
    }
}
