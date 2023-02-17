package oops.classobj

fun main (){
   var User1 = User(26,"Aarav")

    var name = User1.name
    println(User1.name)
    User1.name = "Sam"
    println(User1.name)

    var User2 = User(7,"Mamtha")
    println(User2.name)
    User2.name = "Sam"
    println(User2.name)


    println(User1.equals(User2))  // It will print False
    println(User1 == User2)

}

data class User(val id : Long, var name : String){
    // while creating data class
    // primary constouctor should have at least one parameter
    // Data class can not be Abstract Inner Shield Open. It will not work.
}


