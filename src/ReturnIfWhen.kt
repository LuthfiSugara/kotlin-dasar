fun main() {
    fun sayHello(name:String = ""): String{
        return if(name == ""){
            "Hello World";
        }else{
            "Hello $name";
        }
    }

    fun sayHi(age:Int = 0): String{
        return when(age){
            0 -> "Unknown"
            else -> "Umur Cukup"
        }
    }

    println(sayHello())
    println(sayHello("Eko"))
    println(sayHi(10))
}