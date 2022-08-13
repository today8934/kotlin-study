package main.com.etc.java;

public interface JavaSwimable {

    default void act() {
        System.out.println("어푸 어푸");
    }

    void swim();
}
