import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.browser.document

suspend fun main() {
    val client = HttpClient()
    val resp = client.get<String>("https://httpbin.org/get")
    document.write(resp)
}
