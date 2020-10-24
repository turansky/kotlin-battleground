@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

@JsName("Object")
external interface Object {
    companion object {
        fun keys(o: Any): Array<out String>
    }
}
