fun main() {
    fun hello(value: String, transformer:(String) -> String): String{
        return "Hello ${transformer(value)}"
    }

    val upper = fun(value: String): String{
        if (value == ""){
            return  "UPS"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Luthfi", upper))
    println(hello("", upper))

    println(hello("", fun(value: String):String{
        return  value.toLowerCase()
    }))
}