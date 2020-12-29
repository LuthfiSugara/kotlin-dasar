fun main() {
    val result = double(10)
    println("hasil $result")
    hi("Luthfi")
}

fun double(a: Int): Int = a * 2;

fun hi(name: String): Unit = println("Hi $name")