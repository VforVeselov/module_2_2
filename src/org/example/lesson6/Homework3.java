package org.example.lesson6;

import org.example.lesson6.homework.CarBroken;
import org.example.lesson6.homework.User;
import org.example.lesson6.homework.UserBroken;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Homework3 {
    public static void main(String[] args) throws IllegalAccessException {
        //Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера

        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер

        HashSet<UserBroken> userBrokens = new HashSet<>();
        userBrokens.add(new UserBroken(1, "Yuri"));
        userBrokens.add(new UserBroken(2, "Yuri"));
        //userBrokens.add(new UserBroken(2, "Yuri"));

        System.out.println(userBrokens);

        HashMap<UserBroken, UserBroken> map = new HashMap<>();
        map.put(null, new UserBroken(1, "Yuri"));
        map.put(null, new UserBroken(2, "Yuri"));
        System.out.println(map);

        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
        HashMap<CarBroken, Integer> hashMap = new HashMap<>();
        hashMap.put(new CarBroken(), 1);

        hashMap.put(new CarBroken(), 2);
        hashMap.put(new CarBroken(), 3);

        Field declaredField = null;
        for (Field field : hashMap.getClass().getDeclaredFields()) {
            if (field.getName().equals("table")) {
                declaredField = field;
            }
        }

        declaredField.setAccessible(true);
        Arrays.stream((Object[]) declaredField.get(hashMap)).forEach(e -> System.out.println(e));
        System.out.println(hashMap);

    }
}
