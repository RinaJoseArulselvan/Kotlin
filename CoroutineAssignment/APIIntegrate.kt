import java.net.URL
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import java.io.File

fun retrieveDataFromAPI(url: String,file:File): String {
    val apiData = URL(url).readText()
    file.writeText(apiData)
    return apiData
}

fun integrateAPIs(apiUrls: List<String>,file: File): List<String> = runBlocking {
    val deferredResults = apiUrls.map { url ->
        async {
            retrieveDataFromAPI(url,file)
        }
    }

    deferredResults.awaitAll()
}

fun main(){
    val apiUrls = listOf(
        "https://api.coindesk.com/v1/bpi/currentprice/BTC.json", //current price of bitcoin api
        "https://rickandmortyapi.com/api/character/108", // rick and morty characters api
        "https://api.techniknews.net/ipgeo/", //Geolocation by IP address
        "https://api.quotable.io/quotes/random"  //random qoutes api
    )

    var file= File("C:\\Users\\RINA JOSE\\Documents\\samplle.txt")
    val results = integrateAPIs(apiUrls,file)
    println( file.readText())
    results.forEach { result ->
        println(result)
    }
}