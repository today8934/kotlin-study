package main.com.lec12;

public class Lec12Main {
    public static void main(String[] args) {
        Person.Factory.newBaby("ABC");
        Person.newBaby("ABC");

        moveSomething(new Moveable() {
            @Override
            public void move() {
                System.out.println("움직인당~~");
            }

            @Override
            public void fly() {
                System.out.println("난당~~~");
            }
        });
    }

    private static void moveSomething(Moveable moveable) {
        moveable.move();
        moveable.fly();
    }
}
