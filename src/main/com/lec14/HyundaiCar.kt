package main.com.lec14

sealed class HyundaiCar(
    val name: String,
    val price: Long
) {
}

class Avante: HyundaiCar("아반떼", 1000L)

class Sonata: HyundaiCar("소나타", 2000L)

class Grandeur: HyundaiCar("그랜저", 3000L)