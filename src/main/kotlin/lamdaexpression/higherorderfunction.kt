package lamdaexpression

import sun.util.resources.cldr.fr.CalendarData_fr_GN
import kotlin.math.pow

fun main(){
    println(sum(10.10,20.10))
    print(power(10.0,20.0))

    // we can store fun in variable in kotlin
    val fn: (a: Double, b: Double) -> Double = ::sum
    val fn2: (a: Double, b: Double) -> Double = ::power
    val fn3: (Int) -> Int = ::hello
    println(fn(2.0,4.0))
    println(fn2(3.0,8.0))
    println(fn3(245))

    // higher order funciton
    // take input as funciton or return funciton or both
    calculator(5.0,10.0, ::sum)


    //lamda
    // anonymous function (fuction who doesn't have name)
    val lambda1 = {x:Int,y:Int-> println(x+y)}

    // last line will be return type in multi line lambda expression
    val multiLinelmbda = {
        println("Hello lambda")
        val a = 2+3
        "Hello from lambda"
        2
    }

    lambda1(2,3)
    multiLinelmbda()
    //printing return type
    println(multiLinelmbda())


    val singleparam = {x:Int -> x*x}
    val lambda2:(Int)->Int = {x -> x*x}
    val sayHi: (String) -> Unit = {mag -> println("Hello $mag")}

    val simplySingleParam : (Int) -> Int = {it + it}
}


fun calculator(a: Double,b: Double, gn: (Double,Double) -> Double){
    val result = gn(a,b)
    println(result)
}
fun sum ( a : Double,  b : Double) : Double{
    return a+b
}

fun power(a: Double,b: Double):Double{
    return a.pow(b)
}

fun hello(a : Int) : Int {
    return a
}