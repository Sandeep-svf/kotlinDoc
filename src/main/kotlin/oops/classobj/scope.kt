package oops.classobj

fun main(){

    myFunction(100)
}

fun myFunction(a:Int){  // this a is parameter...
    // can't assign value to a bcoz it is not variable it is parameter....
    // can pass the argument only when calling the function....
    //a = 10


    // here a is variable ....
    var a = 10

    println(a)  // variable value is going to print here... which is 10 not parameter value 100


    /*** why kotlin allow declear as the same name parameter
     * this is call SHADOWING and it is useful for decoupling your code from other part of the system...*/


}