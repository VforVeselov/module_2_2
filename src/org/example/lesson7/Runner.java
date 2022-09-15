package org.example.lesson7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

    public static void checkAnnotationOverClass(UserMeta obj) {
        if (obj.getClass().isAnnotationPresent(GetMetaData.class)) {
            for (Field fields: obj.getClass().getDeclaredFields()) {
                System.out.println(fields);
            }
        }
    }

    public static void checkAnnotationOverAttr(UserMeta userMeta) throws IllegalAccessException {
        for (Field declaredField: userMeta.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(GetMetaData.class)) {
                System.out.println(declaredField.getName() + " = " +declaredField.get(userMeta));
            }
        }

    }

    public static void checkAnnotationOverMethod(UserMeta userMeta) throws InvocationTargetException, IllegalAccessException {
        for (Method method: userMeta.getClass().getDeclaredMethods()) {
            method.setAccessible(true);
            if (method.isAnnotationPresent(GetMetaData.class)) {
                long start = System.currentTimeMillis();
                method.invoke(userMeta, "String");
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }
    }
}
