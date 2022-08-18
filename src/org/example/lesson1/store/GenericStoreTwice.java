package org.example.lesson1.store;

/**
 * Создание магазина, который ориентируется на два товара
 */
public class GenericStoreTwice<T, V> {
    private T good;
    private V good2;

    public GenericStoreTwice() {
    }

    public T getGood() {
        return good;
    }

    public void setGood(T good) {
        this.good = good;
    }

    public V getGood2() {
        return good2;
    }

    public void setGood2(V good2) {
        this.good2 = good2;
    }
}
