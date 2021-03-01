import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.browser.document
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        val client = HttpClient()
        val resp = client.get<String>("https://httpbin.org/get")
        document.write(resp)
    }
}
