import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {

    runBlocking {
        println("Main Program starts :${Thread.currentThread().name}")

        val job:Job=launch {//creates a background coroutine that runs on a background thread
            println("Background starts: ${Thread.currentThread().name}")
            delay(1000)
            println("Background ends: ${Thread.currentThread().name}")
        }

          job.join()

        println("Main program ends :${Thread.currentThread().name}")

    }


}
