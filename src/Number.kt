fun main() {
    var byteNumber: Byte = 127
    var shortNumber: Short = 32767
    var intNumber: Int = 2147283647
    var longNumber: Long = 9223372036854775807


    println("Byte : $byteNumber")
    println("Short : $shortNumber")
    println("Integer : $intNumber")
    println("Long : $longNumber")

    var floatNumber: Float = 98.98F
    var doubleNumber: Double = 2342342343.54535

    println("FLoat : $floatNumber")
    println("Radius : $doubleNumber")

//    Literal
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println("Decimal : $decimalLiteral")
    println("HexaDesimal : $hexadecimalLiteral")
    println("Binary : $binaryLiteral")

//    Underscore
    var underscore: Int = 100_000_000
    println("Underscore : $underscore")

//    Conversion
    var convertNumber = 100
    println("Konversi Number :  ${convertNumber.toString()}")
}