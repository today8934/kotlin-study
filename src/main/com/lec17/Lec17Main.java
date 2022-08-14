package main.com.lec17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lec17Main {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("사과", 1000),
                new Fruit("사과", 1200),
                new Fruit("사과", 1200),
                new Fruit("사과", 1500),
                new Fruit("바나나", 3000),
                new Fruit("바나나", 3200),
                new Fruit("바나나", 2500),
                new Fruit("수박", 10000)
        );

        List<Fruit> result = Lec17Main.filterFruits(fruits, fruit -> fruit.getName().equals("사과"));

        result.forEach(it -> {
            System.out.println(String.format("name: %s, price: %s", it.getName(), it.getPrice()));
        });

        List<Fruit> result2 = Lec17Main.filterFruits2(fruits, fruit -> fruit.getPrice() >= 2000);

        result2.forEach(it -> {
            System.out.println(String.format("name: %s, price: %s", it.getName(), it.getPrice()));
        });

        List<Fruit> result3 = Lec17Main.filterFruits(fruits, Fruit::isApple);

        result3.forEach(it -> {
            System.out.println(String.format("name: %s, price: %s", it.getName(), it.getPrice()));
        });

        String targetFruitName = "바나나";
        targetFruitName = "수박";
        //filterFruits(fruits, (fruit) -> targetFruitName.equals(fruit.getName()));
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        List<Fruit> results = new ArrayList<>();
        for (Fruit fruit: fruits) {
            if (fruitFilter.test(fruit)) {
                results.add(fruit);
            }
        }
        return results;
    }

    private static List<Fruit> filterFruits2(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        return fruits.stream().
                filter(fruitFilter).
                collect(Collectors.toList());
    }
}
