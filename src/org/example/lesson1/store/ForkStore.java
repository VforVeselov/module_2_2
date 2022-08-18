package org.example.lesson1.store;

public class ForkStore {
    private Fork fork;

    public ForkStore(Fork fork) {
        this.fork = fork;
    }

    public Fork getFork() {
        return fork;
    }

    public void setFork(Fork fork) {
        this.fork = fork;
    }

}
