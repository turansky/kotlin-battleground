import io.ktor.client.*
import io.ktor.client.engine.js.*
import io.ktor.client.request.*
import kotlinx.browser.document
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        val client = HttpClient(Js)
        val resp = async { client.get<String>("https://httpbin.org/get") }.await()
        document.write(resp)
    }
}
