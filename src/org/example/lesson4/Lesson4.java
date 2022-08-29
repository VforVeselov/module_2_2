package org.example.lesson4;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Lesson4 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Flyable flyable = () -> System.out.println("Утка летит");

        //Абсолютно идентично записи сверху
        Flyable flyable1 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Утка летит");
            }
        };
        flyable.fly();

        //Stream - это преобразование данных в поток и совершение операций над каждым элементом потока.
        List<Integer> integers = Arrays.asList(1, 2, 4, 10, 12);
        // 1 2 4 10 12
        // 3 4 6 12 14
        Consumer<Integer> consumer = new Consumer<>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        integers.stream()
                .map(new MyFunction())
                .filter(e -> e > 5)
                .forEach(consumer);

        AtomicInteger count = new AtomicInteger();
        Stream.generate(() -> count.incrementAndGet()).limit(10).forEach(e -> System.out.println(e));
        Stream.generate(() -> new Random().nextBoolean()).limit(10).forEach(e -> System.out.println(e));

        int count2 = 0;
        int increment = 50;
        for (int i = 0; i < 10; i++) {
            count2 += increment;
        }
        System.out.println(count2);

//        integers.stream()
//                .map(e -> {
//                    try {
//                        return add(e);
//                    } catch (Exception ex) {
//                        throw new RuntimeException(ex);
//                    }
//                }).forEach(e -> System.out.println(e));

//        List<Integer> integers2 = integers.stream()
//                .map(e -> e + 3)
//                .collect(Collectors.toList());
//        System.out.println(integers2);
//
//        List<User> users = Arrays.asList(new User("Yuri"), new User("Petr"));
//        users.stream()
//                .forEach(e -> {
//                    System.out.println(e);
//                    e.setName("Konstantin");
//                    System.out.println(e.getName());
//                });
//
//        System.out.println(users.get(0).getName());

        Arrays.asList(flyable)
                .stream()
                .forEach(e -> e.fly());
                //.forEach(Flyable::fly);
//        integers.stream()
//                .forEach(System.out::println);
//
//        for (Method method : flyable.getClass().getMethods()) {
//            if (method.getName().equals("fly")) {
//                method.invoke(flyable, new Object[0]);
//            }
//        }


    }

    public static Integer add(Integer e) throws Exception {
        if (e % 2 == 0) {
            throw new Exception("Число четное, до свидания");
        }
        return e + 2;
    }
}
