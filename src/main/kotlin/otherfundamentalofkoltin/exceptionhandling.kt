package otherfundamentalofkoltin


import java.lang.Exception
import kotlin.ArithmeticException

fun main(){
    // handling run time problem which occurs in the program and would otherwise lead to program terminated
    // -> Running out of memory
    // -> array out of bound
    // -> condition like divided by zero


    // It handel run time problems and maintain the flow of program execution

    // Throwable class
    // -> throw
    // four keyword -> try , catch, finlay ,throw

    // try -> it contain set of statement which might generate exception.
    // it must be followed by catch or finally ot both.

    // catch -> used to catch the exception thrown by try block
    // finally -> always execute weather exception handle or not. (Used for close data connection, close buffer etc.)

    // throw -> used to throw an exception explicitly

    // unchecked exception -> exception thrown due to mistake in our code
    // it extends RunTimeException class
    // it checked on tun time not compile time
    // i.e. Arithmetic exception , Array out of bound, Security exception, Null pointer exception


    // Check Exception -> Checked at compile time
    // extends Throwable class
    // i.e. Io Exception, SQL exception

    // try catch

    val str = getNumber("10")
    println(str)


    // Multiple catch block
    val a = IntArray(5)
    try {
        a[5] = 10 / 0
    } catch (e: ArithmeticException) {
        println("airthmetic exception catch")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("array index out of bound exception catch")
    }catch (e: Exception){
        println("parent exception class")
    }

    // Nested try catch block
    // when a block of code generate exception
    // and within that block another code statement also generate another exception

    // syntax
    try {
        try {

        }catch (e: Exception){

        }
    }catch (e: Exception){

    }


    // finally block

    try {

    }catch (e: Exception){

    }finally {
        // mostly used for close the connection...
    }

    // throw keywords
    // used to throw a custom exception
    // Syntax
    // throw ArithmeticException()

    validate(15)
    println("code after validation check.....")
}

fun validate(age: Int){
    if (age < 18)
        throw ArithmeticException("under age")
    else
        println("Eligible for drive....")



}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: Exception) {
        0
    }








}
