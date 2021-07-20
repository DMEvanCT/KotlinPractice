import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.BodyProgress.Feature.install
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main() {
    val client = HttpClient(CIO)
        install(Auth) {
            bea


    }
    val response: HttpResponse = client.get("https://ktor.io/") {
        parameter("price", "asc")
    }

}