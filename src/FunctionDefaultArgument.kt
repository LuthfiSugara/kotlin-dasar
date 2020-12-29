fun main() {
    hello("Luthfi")
    hello("luthfi", "sugara")
}
fun hello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hello $firstName");
    }else{
        println("Hello $firstName $lastName");
    }
}