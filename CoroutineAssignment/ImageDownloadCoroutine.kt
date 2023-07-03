package Assignment
import kotlinx.coroutines.*
import java.io.File
import java.net.URL
class ImageDownloadCoroutine {
    fun downloadImage(url: String, outputDir: String) {
        val fileName = url.substringAfterLast("/")
        val outputFile = File(outputDir, fileName)

        try {
            val connection = URL(url).openConnection()
            connection.getInputStream().use { input ->
                outputFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            println("Downloaded: $url")

        } catch (e: Exception) {
            println("Failed to download: $url")
        }
    }
}
fun main() {

    val imageDownloadCoroutine = ImageDownloadCoroutine()
    val directory = "C:\\Users\\rinajose.a\\Downloads\\images"
    val imageUrls = listOf(
        "https://img.freepik.com/premium-photo/colorful-flowers-colorful-background_900958-10009.jpg",
        "https://img.freepik.com/premium-photo/colorful-flowers-white-background_900958-10024.jpg",
        "https://img.freepik.com/premium-photo/colorful-floral-pattern-with-flowers-leaves_900958-4862.jpg",
        // Add more image URLs here
    )

  runBlocking {
        val tasks = imageUrls.map { url ->
            async {
                imageDownloadCoroutine.downloadImage(url, directory)
            }
        }
        tasks.forEach {
            it.join()
        }
        println("All images downloaded successfully.")
    }
}
