@file:JsModule("yfiles")
@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package yfiles.lang

external interface IComparable<T> {
    operator fun compareTo(other: T): Int

    companion object
}