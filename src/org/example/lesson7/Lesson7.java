package org.example.lesson7;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson7 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        UserRef petr = new UserRef(10, "Petr");

        //Перебор полей
        Class<? extends UserRef> aClass = petr.getClass();
        for (Field field : petr.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            //System.out.println(field.get(petr));
        }

        setNewValue(petr, "Yuri", "name");
        setNewValue(petr, 15, "age");

        HashMap<Integer, Map<String, Object[]>> mapUser = new HashMap<>();
        Map<String, Object[]> userData1 = new HashMap<>();
        userData1.put("typeArg", new Class[]{Integer.class, String.class});
        userData1.put("initArg", new Object[]{20, "Yuri"});

        Map<String, Object[]> userData2 = new HashMap<>();
        userData2.put("typeArg", new Class[]{String.class});
        userData2.put("initArg", new Object[]{"Yuri"});

        mapUser.put(1, userData1);
        mapUser.put(2, userData2);

        ArrayList<UserRef> userRefList = new ArrayList<UserRef>();

        mapUser.forEach((key, value) -> {
            try {
                Class[] typeArgs = (Class[]) value.get("typeArg");
                Constructor<? extends UserRef> declaredConstructor = petr.getClass().getDeclaredConstructor(typeArgs);
                UserRef newUser = declaredConstructor.newInstance(value.get("initArg"));
                userRefList.add(newUser);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });

        //System.out.println(userRefList);

        //Получение конструктора
        Constructor<? extends UserRef> constructor = petr.getClass().getConstructor(Integer.class, String.class);
        UserRef lenya = constructor.newInstance(18, "Lenya");
        //System.out.println(lenya);

        //Получение объявленных методов
        for (Method declaredMethod : petr.getClass().getDeclaredMethods()) {
            //System.out.println(declaredMethod.getName());
            //System.out.println(Modifier.isStatic(declaredMethod.getModifiers()));
            if (declaredMethod.getName().equals("getName")) {
                try {
                    Object resultMethod = declaredMethod.invoke(petr);
                    System.out.println(resultMethod);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }


        // static final private protected default public
        // 0       1    1        0          0       0       = 011000 -> 7
        // 1       0    0        0          0       1       = 100001 -> 12


        //Аннотации
//        for (Method declaredMethod : UserRef.class.getDeclaredMethods()) {
//            if (declaredMethod.isAnnotationPresent(TimeToScale.class)) {
//                long start = System.currentTimeMillis();
//                declaredMethod.invoke(petr);
//                long end = System.currentTimeMillis();
//                System.out.println(end - start);
//            }
//        }

        UserRef kolya = new UserRef(10,"Kolya");
        for (Field declaredField : kolya.getClass().getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(Min.class)) {
                declaredField.setAccessible(true);
                int value = (int) declaredField.get(kolya);
                Min annotation = declaredField.getAnnotation(Min.class);
                int minValue = annotation.value();
                if (value < minValue) {
                    declaredField.set(kolya, minValue);
                }
            }
        }

        System.out.println(kolya);
    }

    public static void setNewValue(Object obj, Object newValue, String fieldName) throws IllegalAccessException {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.getName().equals(fieldName)) {
                field.setAccessible(true);
                field.set(obj, newValue);
            }
        }

    }
}
