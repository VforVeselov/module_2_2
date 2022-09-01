package org.example.lesson4;

import java.util.ArrayList;
import java.util.List;

public class myUser {
    private int id;
    private List<Integer> list = new ArrayList<>();


    public myUser() {
    }

    public myUser setId(int id) {
        this.id = id;
        this.list = new ArrayList<>(id);
        for (int i = 0; i < id; i++) {
            this.list.add((int) (Math.random() * 10));
        }
        return this;
    }


    public myUser setList(List<Integer> list) {
        this.list = list;
        return this;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getList() {
        return list;
    }
}
