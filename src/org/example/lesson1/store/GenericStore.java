package org.example.lesson1.store;

/**
 * GenericStore - Класс хранения одного типа товара
 * <T> - Переменная в которой будет хранится Класс
 * Инициализация T (замена T на реальный класс) - происходит во время создания Экземпляра класса!
 */
public class GenericStore <T> {
    private T good;

    public GenericStore(T good) {
        this.good = good;
    }

    public T getGood() {
        return good;
    }

    public void setGood(T good) {
        this.good = good;
    }

    //Метод преобразующий объект в переданный тип класса
    //Для ограничения типов, которые могут быть переданы в качестве параметра мы используем слово extends
    //extends означает, что любой передаваемый класс должен быть либо этим Классом либо его наследником.
    //T extends Good - означает любой класс являющийся Good или его наследником.
    public static <T extends Good> T castToType(Object obj, Class<T> tClass) {
        return tClass.cast(obj);
    }

}
