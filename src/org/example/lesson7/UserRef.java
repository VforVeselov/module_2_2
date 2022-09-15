package org.example.lesson7;


public class UserRef {
    @Min(18)
    private Integer age;
    public String name;

    public UserRef(@NotNull Integer age, String name) {
        this.age = age;
        this.name = getUppercase(name);
        System.out.println("ура");
    }

    public UserRef(String name) {
        this.name = name;
    }

    public UserRef() {
    }

    @TimeToScale
    public String getName() throws Exception {
        Thread.sleep(1000);
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getUppercase(String lowercase) {
        return lowercase.toUpperCase();
    }

    @Override
    public String toString() {
        return "UserRef{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
