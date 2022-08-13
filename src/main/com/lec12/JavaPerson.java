package main.com.lec12;

public class JavaPerson {

    private static final int MIN_AGE = 1;

    public static main.com.etc.java.JavaPerson newBaby(String name) {
        return new main.com.etc.java.JavaPerson(name, MIN_AGE);
    }
    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
