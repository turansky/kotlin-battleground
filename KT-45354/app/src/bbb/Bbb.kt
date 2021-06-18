import kotlinx.browser.document
import org.w3c.dom.HTMLElement

@JsExport
@ExperimentalJsExport
fun Bbb(): HTMLElement =
    document.createElement("div")
        .unsafeCast<HTMLElement>()
