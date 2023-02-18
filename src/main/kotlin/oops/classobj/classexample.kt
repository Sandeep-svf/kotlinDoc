package oops.classobj

fun main(){


    // creating obj
    var aarav : Person = Person("Aarav","Maurya",6)
    aarav.age = 8
    println(aarav)
    println("Aarav is ${aarav.age} year old")

    var mamtha = Person( "Mamtha","Kotian",55)
    var sam = Person(firstName = "Sam")

    // calling method
    sam.hobby = "Flying in the sky"

    sam.stateHobby()

    mamtha.hobby = "Doing pendulam work"

    mamtha.stateHobby()


    var master : Person = Person("master","G")
    println(master)

}

class Person constructor(firstName : String = "Mamtha", lastName: String = "Kotian")  {

    // Member Variable - Properties
    var age : Int? = null
    var hobby : String = "Watching Netflix"
    var firsName : String? = null


    // Initializer block
    init {
        this.firsName = firsName
        println("Person obj created with firstname $firstName and lastname $lastName")
    }

    // Member - Secondary Constructor
    constructor(firstName: String, lastName: String, age : Int)
            : this(firstName,lastName){  // firstName and lastName should be coming from out primary constructor
                this.age = age    // age is being assigned to the class variable from parameter

        println("Person obj created with firstname $firstName and lastname $lastName with age $age")
            }


    // Member Function - Method
    fun stateHobby (){
        println("$firsName Hobby is $hobby")
    }


}