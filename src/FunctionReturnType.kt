fun main() {
    val result = sum(10, 10);
    val result2 = bagi(10, 0);
    println("Hasil $result");
    println("Hasil $result2")
}

fun sum(a: Int, b: Int): Int{
    val total = a + b;
    return total;
}

fun bagi(a: Int, b: Int): Int{
    if(a == 0 || b == 0){
        return 0;
    }else{
        val total = a / b;
        return total;
    }
}