package main.com.lec18

fun main() {

    val fruits: List<Fruit> = listOf(
        Fruit(1, "사과", 1000, 1500),
        Fruit(2, "사과", 1200, null),
        Fruit(3, "사과", 1100, null),
        Fruit(4, "바나나", 1000, 2500),
        Fruit(5, "바나나", 1500, 2500),
        Fruit(6, "수박", 1500, 3500),
        Fruit(7, "자두", 1000, 2500),
        Fruit(8, "포도", 800, 1500),
    )
    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
        println(idx)
        fruit.currentPrice
    }

    val values = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.currentPrice }

    for (value in values) {
        println(value)
    }

    for (apple in apples) {
        println("name: ${apple.name}, factoryPrice: ${apple.factoryPrice}, currentPrice: ${apple.currentPrice}")
    }

    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNoApple = fruits.none { fruit -> fruit.name == "사과 "}
    val isAnyApple = fruits.any { fruit -> fruit.factoryPrice >= 10000 }
    val fruitCount = fruits.count()
    val sortedFruitByCurrentPriceByAscending = fruits.sortedBy { fruit -> fruit.currentPrice }
    val sortedFruitByCurrentPriceByDescending = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }.map { fruit -> fruit.name }
    val firstFruit = fruits.first()
    val firstOrNullFruit = fruits.firstOrNull()
    val lastFruit = fruits.last()
    val lastOrNullFruit = fruits.lastOrNull()

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    val map3: Map<String, List<Long>> = fruits.groupBy(
        { fruit -> fruit.name}, { fruit -> fruit.factoryPrice}
    )

    val map4: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }

    for ((key, value) in map) {
        println("key: $key, value: $value")
    }

    for ((key, value) in map2) {
        println("key: $key, value: $value")
    }

    for ((key, value) in map3) {
        println("key: $key, value: $value")
    }

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1000, 1500),
            Fruit(2, "사과", 1200, 1500),
            Fruit(3, "사과", 1200, 1500),
            Fruit(4, "사과", 1500, 1500),
        ),
        listOf(
            Fruit(5, "바나나", 3000, 3200),
            Fruit(6, "바나나", 3200, 3200),
            Fruit(7, "바나나", 2500, 3200),
        ),
        listOf(
            Fruit(8, "수박", 10000, 10000)
        )
    )

    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }
    val flatFruitList = fruitsInList.flatten()
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}