import kotlinx.browser.document
import org.w3c.dom.HTMLElement

@JsExport
@ExperimentalJsExport
fun Aaa(): HTMLElement =
    document.createElement("div")
        .unsafeCast<HTMLElement>()
