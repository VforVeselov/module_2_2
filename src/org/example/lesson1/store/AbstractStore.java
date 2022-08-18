package org.example.lesson1.store;

public class AbstractStore {
    private Object object;

    public AbstractStore(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
