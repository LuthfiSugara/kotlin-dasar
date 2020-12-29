fun main() {
    val result = finalValue("Luthfi", 10, 10, 10, 10, 10)
    println(result)
}

fun finalValue(name: String, vararg values: Int){
    var total = 0.0;
    for (value in values){
        total += value
    }

    total /= values.size
    println("Final Value $name = $total")
}