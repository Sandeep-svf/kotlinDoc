package coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking



// Note
/*** If you remove or forget runBlocking in this code, you'll get an error on the launch call,
 * since launch is declared only on the CoroutineScope: */


/*** launch is a coroutine builder. It launches a new coroutine concurrently with the rest of the code */
/*** delay is a special suspending function. It suspends the coroutine for a specific time. */
/*** runBlocking is also a coroutine builder that bridges the non-coroutine world of a regular fun main() and the code
 * with coroutines inside of runBlocking { ... } curly braces. */


/*** The name of runBlocking means that the thread that runs it (in this case — the main thread)
 * gets blocked for the duration of the call, until all the coroutines inside runBlocking { ... }
 * complete their execution*/





/*fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("Maurya") // print after delay
        doWork()
    }
    println("Sam") // main coroutine continues while a previous one is delayed
}*/

/*fun main() = runBlocking {
   // doMyWork()
    //doAnotherWork()
    *//*** An explicit job *//*
    *//*A launch coroutine builder returns a Job object that is a handle to the launched coroutine and can be used to
    explicitly wait for its completion. For example, you can wait for completion of the child coroutine and then
    print "Done" string:*//*

    val job = launch {
        delay(5000L)
        println("Door closed")
    }
    println("Connection initiated...")
    println("Door Open")
    job.join()
    println("Connection closed...")

}*/


/*** /*** Coroutines are light-weight */ */

/***  For example, the following code launches 100000 distinct coroutines that each wait 5 seconds and then print
a period ('.') while consuming very little memory:


If you write the same program using threads (remove runBlocking, replace launch with thread, and replace delay
with Thread.sleep), it will likely consume too much memory and throw an out-of-memory error.*/
fun main() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}


/*** Scope builder */
//  it is possible to declare your own scope using the coroutineScope builder
//  It creates a coroutine scope and does not complete until all launched children complete.

/*** runBlocking and coroutineScope builders may look similar because they both wait for their body and all
 * its children to complete. The main difference is that the runBlocking method blocks the current thread
 * for waiting, while coroutineScope just suspends, releasing the underlying thread for other usages.*/

suspend fun doMyWork() = coroutineScope{
    launch {
        delay(1000L)
        println("Maurya")
    }
    println("sam")




}


/*** Scope builder and concurrency */
//A coroutineScope builder can be used inside any suspending function to perform multiple concurrent operations.

suspend fun doAnotherWork() = coroutineScope {
    launch {
        delay(2000L)
        print("Maurya")
    }
    launch {
        delay(1000L)
        print("Aarav ")
    }

    print("Hello ! MY name is: ")
}







/*** Structured concurrency
Coroutines follow a principle of structured concurrency which means that new coroutines can be only launched in
a specific CoroutineScope which delimits the lifetime of the coroutine.*/

/** Extract function refactoring */
//Let's extract the block of code inside launch { ... } into a separate function.
//When you perform "Extract function" refactoring on this code, you get a new function with the suspend modifier.
//This is your first suspending function.

// this is your first suspending function
suspend fun doWork() {
    delay(1000L)
    println("this is my name.")
}


