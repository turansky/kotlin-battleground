@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

@JsName("Object")
external interface IObject {
    companion object {
        fun keys(o: Any): Array<out String>
    }
}

@JsName("Array")
external class IArray<T> {
    val length: Int

    companion object {
        fun <T> of(vararg items: T): IArray<out T>
    }
}

@JsExport
@ExperimentalJsExport
val data: Any = IObject.Companion

@JsExport
@ExperimentalJsExport
val data2: Any = IArray.Companion
