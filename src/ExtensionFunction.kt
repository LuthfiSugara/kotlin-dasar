fun main() {
    val name: String = "Luthfi";
    val hello: String = name.hello();
    println(hello);

    name.printHello()
    "Luthfi".printHello();
}

fun String.hello() : String{
    return "Hello $this";
}

fun String.printHello(): Unit = println("Hello $this")