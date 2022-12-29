package codecamporg

import javax.print.attribute.standard.JobOriginatingUserName

/*fun newUser () : String {
    return "new user created: ..."
}*/
/*** fun newUser () : String =  "sam"   // single expression function....*/

// we can remove return type...
fun newUser () = "sam"



fun sayHello() : Unit { // unit -> this return nothing useful...

    println(newUser())
}


// parameter function , value and type
/*fun sayUser(userName : String) {
    // println("Hello " +userName)
    println("Hello $userName")
}*/

// can be written as function expression...
fun sayUser(userName: String) =  println("Hello $userName")

fun userFullName(firstName: String, lastName : String) = println("$firstName $lastName")
fun main() {
    // like variable function can be defined out of the class.. like independent ...

    println(newUser())
   //sayHello()
   // sayUser("sam")
   // userFullName("aarav","warrior")

    val userName = arrayOf("aarav","sam","warrior")
    println(userName.size)
    println(userName[0])  // [] and get () both are same...
    println(userName.get(0))

    // printing all emlement from an array..
    for(item in userName){
        println(item)
    }

    userName.forEach {
        println(it)
    }
    // can rename it as below

    userName.forEach { item ->
        println(item)
    }

    // can handel data by index also

    userName.forEachIndexed { index, userName ->

        println("$userName at index $index")
    }
}