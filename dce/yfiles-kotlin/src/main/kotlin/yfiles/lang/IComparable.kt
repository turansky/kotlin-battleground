@file:JsModule("yfiles")

package yfiles.lang

external interface IComparable<T> {
    operator fun compareTo(other: T): Int
}