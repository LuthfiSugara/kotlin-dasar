fun hello(value: String, transformer:(String) -> String): String{
    return "Hello ${transformer(value)}"
}

fun main() {
    val upperTransformer = {value: String -> value.toUpperCase()}
    val lowerTransformer = {value: String -> value.toLowerCase()}
    println(hello("Luthfi", upperTransformer))
    println(hello("Sugara", lowerTransformer))

    val result1 = hello("Luthfi", {value: String -> value.toLowerCase()})
    //    Trailing Lambda
    val result2 = hello("Sugara") {value: String ->
        value.toLowerCase()
    }

    println(result1)
    println(result2)

}