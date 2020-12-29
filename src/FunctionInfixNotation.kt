fun main() {
    val result = "Luthfi" to "UP";
    println(result)
}

infix fun String.to(type: String): String{
    if (type == "UP"){
        return this.toUpperCase();
    }else{
        return  this.toLowerCase();
    }
}