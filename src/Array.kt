fun main() {
    val members: Array<String> = arrayOf("Luthfi", "Sugara", "Programmer")

    members[0] = "Luthfi2"
    members.set(1, "Sugara2")

    val name1: String = members[0]
    val name2: String = members.get(1)
    val name3: String = members.get(2)

    println("$name1 $name2 $name3")

//    array Null
    val members2: Array<String?> = arrayOfNulls(5)
    members2[0] = "member 0"
    members2[1] = "member 1"
    members2[2] = null
    members2[3] = "member 3"
    members2[4] = "member 4"
    println(members2[0])
}