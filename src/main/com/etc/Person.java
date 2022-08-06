package main.com.etc;

import org.jetbrains.annotations.NotNull;

public class Person {
    private String name;

    public Person (String name) {
        this.name = name;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
