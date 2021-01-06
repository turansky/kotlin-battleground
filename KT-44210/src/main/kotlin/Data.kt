@JsExport
@ExperimentalJsExport
@OptIn(ExperimentalStdlibApi::class)
class Data {
    val numbers: List<Int> = buildList {
        this += 4
        this += 8
    }
}
