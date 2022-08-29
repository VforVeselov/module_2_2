package org.example.lesson4;

import java.util.function.Function;

public class MyFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer + 2;
    }
}
