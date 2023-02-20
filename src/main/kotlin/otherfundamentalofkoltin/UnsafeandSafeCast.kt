package otherfundamentalofkoltin

import jdk.nashorn.internal.ir.CallNode.EvalArgs

fun main(args: Array<String>){
    // Unsafe cast operator : as
    // Sometimes it is not possible to cast a variable and it throws exception. this is called unsafe cast
    // perform by infix operator as

    // i.e.  A nullable string (String?) can't be cast to non nullable string (String). This thrown as exception.
    val obj: Any? = null
    //val str : String = obj as String
    // println(str) // null cannot be cast to non-null type kotlin.String
    //at otherfundamentalofkoltin.UnsafeandSafeCastKt

    // Generate a class cast exception
    // Trying to cast an integer value of any type in to a string leads to a class cast exception

    val obj2 : Any = 123
   // val str2 : String = obj2 as String
   // println(str2)  java.lang.int can not be cast to java.lang.string  (Throw class cast exception)


    // nullable for casting to work
    // Source and target variable needs to be nullable for casting to work

    val obj3 : Any? = "String unsafe cast"
    val str3 : String? = obj3 as String   // Works
    println(str3)



    // Safe cast operator : as?
    // return null is casting is not possinle rather than throwing ClassCastException

    val location: Any = "Kotlin"
    val safeString : String? = location as? String // works
    val safeInt : Int? = location as? Int   // can't cast so return null

    println(safeString)
    println(safeInt)





}