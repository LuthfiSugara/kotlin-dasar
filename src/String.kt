fun main() {
    var firstName: String = "Muhammad Luthfi"
    var lastName: String = "Sugara Nasution"
//    var fullName: String = firstName + " " + lastName
    var fullName: String = "$firstName $lastName"
    var desc: String = "nama : $fullName charCount : ${fullName.length}"
    var address: String = """
        Street Not Yet
        Province Sumatera Utara
        Country Indonesia
    """.trimIndent()

    println(firstName)
    println(address)
    println(desc)

}