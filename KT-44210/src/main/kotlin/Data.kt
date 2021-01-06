@JsExport
@ExperimentalJsExport
class Data {
    val numbers: List<Int> = mutableListOf<Int>().apply {
        this += 4
        this += 8
    }
}
