package oops.classobj

fun main(){

    // All class in kotlin non inheritable by default or final
    //  for inharite any class need to make that class open
    // from protecting class to not be inharite need sealed keywords


    var myCar : Cars = Cars("A4","Audi")
    var myECar : ElectricCar = ElectricCar("M-Model","Tesla",200.0)

    myCar.drive(100.0)
    myECar.drive(120.0)

}

////Super class, Parent class, Base call
//open class Vehicle{
//
//    // properties
//    // method
//}

// Sub class , Child class , derived class of Vehcile
open class Cars (val name : String , val brand : String){

    var range : Double = 0.0

    fun extendRange(amount : Double){
        if(amount > 0){
            range += amount
        }
    }

    fun drive(distance : Double ){
        println("Drove for $distance KM")
    }

}

class ElectricCar(name: String, brand: String, batteryLife : Double)
    : Cars(name, brand){







}