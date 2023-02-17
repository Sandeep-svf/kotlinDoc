package codecamporg

fun main() {
    var userName = listOf("sam","aarav","warrior")  // immutable
    var gameUserName = mutableListOf("sam","aarav","warrior")   // mutable list collection...

    gameUserName.add("lifeSaviour")

    /*** // by default collection type in kotlin is immutuable...
    // you can't add subtract value from collection once it is created.*/

    // same as array
    println(userName.get(0))
    println(userName[0])

    userName.forEach { item ->
        println(item)
    }

    // map

    val map = mapOf(1 to "aarav" , 2 to "sam" , 3 to "warrior") // immutable map...
    var gameLevel = mutableMapOf(1 to "aarav" , 2 to "sam" , 3 to "warrior")    // muttable map...

    gameLevel.put(4,"lifeSaviour")

    gameLevel.forEach { t, u ->
        println("$t -> $u")
    }


    map.forEach { key, value ->
        println("$key -> $value")
    }

}