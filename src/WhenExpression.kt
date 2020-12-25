fun main() {
    val finalExam = "A"
    when(finalExam){
//        'A', 'B', 'C' -> "Passed"
        "A" -> println("Amazing")
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        "E" -> println("Try Again Next Year")
        else -> println("Hmmmmmmmm")
    }

    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (finalExam){
        in nilaiLulus -> println("Congratulations.....")
        !in nilaiLulus -> println("Hmmmmmmm")
    }

    val name = "luthfi"
    when(name){
        is String -> println("Name is String")
        !is String -> println("Name not a String")
    }

    val cekAngka = 80
    when{
        cekAngka > 75 && cekAngka <= 80 -> println("Nice")
        cekAngka < 75 -> println("Good")
        else -> println("Hmmmm")
    }
}