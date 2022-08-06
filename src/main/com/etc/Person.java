package main.com.etc;

import org.jetbrains.annotations.NotNull;

public class Person {
    private String name;
    private int age;

    public Person (String name) {
        this.name = name;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public int getAge() {
        return age;
    }
}
