package enumsealedclass

fun main(){
//    val day = Day.SUNDAY
//    println(day)
//    println(day.number)
//
//    // we can loop enum values
//    for(i in Day.values()){
//        println(i)
//    }

//    day.printformettedDate()    // it will print object reference which is SUNDAY

    val tile = Red("Mashrrom",25)
    val tile3 = Blue(30)
//    val tile2 = Red("Fire",32)
//    println("${tile.type} - ${tile.point}")
    val points  = when(tile){

        is Red -> tile.point *2

        else -> {}
    }

    println(points)

}

// Sealed class is abstract class.. we can't make obj of this
// restrict type
sealed class Tile
class Red(val type : String, val point : Int) : Tile()
class Blue(val point : Int) : Tile()


/*
enum class Day(val number : Int){
    // days are object of the class
    // like MONDAY is obj of class day
    // in enum values are instance which means ek bar jo ban gya wo ban gya. we can't change it's state
    // restrict values
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    // since enum is class So we can also define methods
    // this point current object

    fun printformettedDate(){
        println("Dat is $this")
    }

}*/
