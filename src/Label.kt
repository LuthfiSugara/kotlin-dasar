fun main() {
    loopI@ for(i in 0..10) {
        loopJ@ for (j in 0..10){
//            if (i > 5){
//                break@loopI
//            }

            if (j == 5){
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("Luthfi") test@{
        if (it == ""){
            return@test
        }else{
            println("Luthfi")
        }
    }
}