fun main() {
    fullName("Luthfi", "Programmer", "Sugara")
    fullName(firstName = "Luthfi", lastName = "Programmer", middleName = "Sugara")
}

fun fullName(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}