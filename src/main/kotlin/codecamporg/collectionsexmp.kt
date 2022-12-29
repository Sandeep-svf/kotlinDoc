package codecamporg

fun usersName(userName : String , usersProperties : List<String>) {

    usersProperties.forEach(){itemToProperties ->
        println("$userName $itemToProperties")
    }
}

fun usersName2(userName : String , vararg usersProperties : String) {

    usersProperties.forEach(){itemToProperties ->
        println("$userName $itemToProperties")
    }
}


fun greetPerson(greeting: String = "default value : hi" , name : String = "default name : sam") = println("$greeting $name")
fun main() {

    val userMetaData = listOf("first_level","top 5 wrarrier","unbetable warrior")

    usersName("Sam",userMetaData)
    // if you don't want to pass aray than
    usersName("sam", listOf())  // not very useable
    /*** // place of listof() using varrag */

  //  usersName2("sam")   // no need to pass second argument
    // it will treted as empty array.

  //  usersName2("sam","1","2","3")   // we can pass argument also
    // it will be treated as array.

    /*** usersName2("sam",userMetaData) // will throw error
    // bcoz require array of string ...*/
    usersName2("sam",*userMetaData.toTypedArray())  // can add list byu using astric and .totypr array..



    // Named argument...

    greetPerson(name = "Sam", greeting = "Hello !")
    greetPerson(name = "Sam")
    greetPerson()

}