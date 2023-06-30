import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import java.io.File
import java.net.URL


suspend fun scrapeImagesFromUrl(url: String) {
    val outputDir = "C:\\Users\\RINA JOSE\\Documents\\Images"
    try {
        val document: Document = Jsoup.connect(url).get()
        val images: List<Element> = document.select("img")

        for (image in images) {
            val imageUrl = image.absUrl("src")
            // You can download or process the image URL here
            downloadImage(imageUrl, outputDir)
        }

    } catch (e: Exception) {
        e.printStackTrace()
    }
}

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

fun main() {

    val urls = listOf(
        "https://www.amazon.in/",
        "https://www.kaggle.com/",
        "https://www.udemy.com/",
        "https://moz.com/",
        "https://www.similarweb.com/",
        "https://www.entrepreneur.com/",
        "https://www.wix.com/",
        "https://time.com/",
        "https://www.computerhope.com/",
        "https://squareboat.com/",
        "https://www.wikipedia.org/",
        "https://www.weebly.com/",
        "https://www.google.com/",
        "https://www.reddit.com/",
        "https://www.twitter.com/",
        "https://www.facebook.com/",
        "https://www.jetbrains.com",
        "https://stackoverflow.com/",
        "https://www.eclipse.org/",
        "https://wiki.gnome.org/"
    )
    runBlocking {
        val tasks = urls.map { url ->
            async {
                scrapeImagesFromUrl(url)

            }
        }
        tasks.awaitAll()
        println("All images downloaded successfully.")
    }
}