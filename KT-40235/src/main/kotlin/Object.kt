@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

@JsName("Object")
external interface Object {
    companion object {
        fun keys(o: Any): Array<out String>
    }
}

@JsName("Object2")
external class Object2 {
    companion object {
        fun keys(o: Any): Array<out String>
    }
}

@JsExport
@ExperimentalJsExport
val data: Any = Object.Companion

@JsExport
@ExperimentalJsExport
val data2: Any = Object2.Companion
