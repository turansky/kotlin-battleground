@JsExport
@ExperimentalJsExport
open class XData {
    val x: Int = 1
}

@JsExport
@ExperimentalJsExport
class YData : XData() {
    val y: Int = 2
}

@JsExport
@ExperimentalJsExport
class ZData : XData() {
    val z: Int = 3
}
