import kotlinx.browser.document
import org.w3c.dom.HTMLElement

fun create(): HTMLElement =
    document.createElement("div")
        .unsafeCast<HTMLElement>()
