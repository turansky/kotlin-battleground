import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.browser.document

suspend fun main() {
    val client = HttpClient()
    val resp = client.get("https://httpbin.org/get").bodyAsText()
    document.write(resp)
}
