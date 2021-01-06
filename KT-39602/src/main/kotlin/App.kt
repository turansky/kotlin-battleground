@JsName("Array")
external interface IArray {
    val length: Int

    @Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
    companion object {
        fun of(item: Any): IArray

        fun of(vararg items: Any): IArray
    }
}

@JsExport
@ExperimentalJsExport
fun test() {
    println("Class: $IArray")

    val a = IArray.of(13)
    println("Length: ${a.length}")

    val b = IArray.of(4, 8, 15, 16, 23, 42)
    println("Length: ${b.length}")
}
