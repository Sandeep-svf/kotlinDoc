package coroutines

import javafx.application.Application.launch
import kotlinx.coroutines.*


/*** Cancelling coroutine execution */
/*In a long-running application you might need fine-grained control on your background coroutines.
 For example, a user might have closed the page that launched a coroutine and now its result is no longer needed
 and its operation can be cancelled. The launch function returns a Job that can be used to cancel
 the running coroutine:*/
fun main2() = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    job.join() // waits for job's completion
    println("main: Now I can quit.")
}

/* As soon as main invokes job.cancel, we don't see any output from the other coroutine because it was cancelled. */


/*** Cancellation is cooperative */
/*  A coroutine code has to cooperate to be cancellable. All the suspending functions in kotlinx.coroutines are cancellable.
 They check for cancellation of coroutine and throw CancellationException when cancelled.*/
fun main() = runBlocking{

    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) { // computation loop, just wastes CPU
            // print a message twice a second
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")

}