package main.com.etc;

import org.jetbrains.annotations.NotNull;

public class JavaPerson {
    private final String name;
    private int age;

    public JavaPerson(String name) {
        this(name, 1);
    }

    public JavaPerson(String name, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다.", age));
        }

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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 20;
    }
}
