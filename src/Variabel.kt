//    Constant
const val APP = "Kotlin Dasar"
const val VERSION = "1.0.0"


fun main() {
    val firrstName: String = "Luthfi"
    val lastName = "Sugara"

//    error jika mengganti value data
//    lastName = "Luthfi Sugara"

//    Nullabble
    var firstWord: String? = "Luthfi"
    firstWord = null

//    error karena firstWord bisa null
//    println(firstWord.length)
//    cara akses yang benar
    println(firstWord?.length)

    println("$APP : $VERSION")

}