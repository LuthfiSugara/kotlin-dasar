fun main() {
    val names = arrayOf("Luthfi", "Sugara", "Data Mining")
    for (name in names){
        println(name)
    }

    val length = names.size - 1
    for (i in 0..length){
        println("Index $i : ${names.get(i)}")
    }
}