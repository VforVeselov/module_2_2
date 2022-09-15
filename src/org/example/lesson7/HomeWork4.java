package org.example.lesson7;

import org.example.lesson4.homework.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork4 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData, так чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем

        UserMeta userMeta = new UserMeta("name", 10);
        Runner.checkAnnotationOverClass(userMeta);
        Runner.checkAnnotationOverAttr(userMeta);
        Runner.checkAnnotationOverMethod(userMeta);

    }


    //method3.1
    //method3.2
    //method3.3
}
