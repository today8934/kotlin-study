package main.com.lec01;

import main.com.etc.JavaPerson;

import java.util.ArrayList;
import java.util.List;

public class Lec01Main {
    public static void main(String[] args) {
        long number1 = 10L; //(1)
        final long number2 = 10L; //(2)

        Long number3 = 1_000L; //(3)
        JavaPerson javaPerson = new JavaPerson("류욱상"); //(4)

        final List<Integer> numbers = new ArrayList<>();
        numbers.add(3, 4);
    }
}
