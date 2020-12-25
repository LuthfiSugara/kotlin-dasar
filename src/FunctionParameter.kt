fun main() {
    sayHello("Luthfi", 24)
    sayHello("Luthfi", null)
}

fun sayHello(firstName: String, age: Int?){
    if (age == null){
        println("Nama : $firstName")
    }else{
        println("Nama : $firstName, Umur : $age")
    }
}