import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {

    runBlocking {
        println("Main Program starts :${Thread.currentThread().name}")

        GlobalScope.launch {//creates a background coroutine that runs on a background thread
            println("Background starts: ${Thread.currentThread().name}")
            delay(1000)
            println("Background ends: ${Thread.currentThread().name}")
        }

            delay(2000)

        println("Main program ends :${Thread.currentThread().name}")

    }


}
