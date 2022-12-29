package codecamporg
var user : String? = null   // for assign value null need to add ? after datatype...
/*** now user can be null or any value
 * val user : String? = null
 * val user : String? = "samSuperUser"
 * */
val defaultName : String = "SAM009"
var assignId : String = "000125"
fun main() {
    val name : String = "sam"
    var age : String = "25"
    age = "28"

    // age = null // can not assign null to a not null type variable
    println(assignId)
    assignId = "55555"
    println(age)
    println(defaultName)
    println(assignId)
    if(user != null){
        println(user)
    }

   // user = "hjkdsf"
    when(user){
        null -> println("default value printed")
        else -> println(user)
    }

    var userPrintvalue = if(user != null) user else print("printing default value...")
    println(userPrintvalue)

    val userPrintValue2 = when(user){
        null -> "default value 2.."
        else -> user
    }

    println(userPrintValue2)

    /*user = "samSuperUser"
    println(user)*/



}