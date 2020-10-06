@JsExport
@ExperimentalJsExport
class Data {
    init {
        YData()
        ZData()

        println(YData)
        println(ZData)
    }
}

open class XData {
    val x: Int = 1
}

class YData : XData() {
    val y: Int = 2

    companion object {
        init {
            println("yyy")
        }
    }
}

class ZData : XData() {
    val z: Int = 3

    companion object {
        init {
            println("zzz")
        }
    }
}
