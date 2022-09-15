package org.example.lesson7;

@GetMetaData
public class UserMeta {
    String name;
    @GetMetaData
    Integer count;

    @GetMetaData
    public static void GetSuperName(String prefix) throws InterruptedException {
        Thread.sleep(1000);
    }

    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

}
