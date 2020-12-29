fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Luthfi", "Sugara")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Luthfi"))

//    Method Refrences
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Luthfi Sugara"))
}