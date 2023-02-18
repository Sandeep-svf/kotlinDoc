package oops.classobj

import java.lang.IllegalArgumentException

fun main(){
    var myCar = Car()
    println( myCar.myBrand )
    myCar.maxSpeed = 0
    println(myCar.maxSpeed)
    println(myCar.myModel)
}

class Car(){
    lateinit var owner : String

    var master : String? = null


    lateinit var junmp : String


    val myBrand : String = "BMW"

        // custom getter....
        get() {
            return field.lowercase()
        }

    var maxSpeed : Int = 0

        // This code generated automatically when we decleer maxSpeed variable
        get() = field
        set(value)  {
            field = if(value > 0) value else throw IllegalArgumentException("Max speed can not be less than 1")
        }

    var myModel : String = "M5"
        private set    // after using private we can chnage model from this class only...
    init {
        this.myModel = "M0"
        this.owner = "Sam"
    }

}