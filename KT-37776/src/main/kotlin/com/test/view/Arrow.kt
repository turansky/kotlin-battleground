@file:JsModule("yyy")

package com.test.view

external interface IArrow {
    val length: Double
    val cropLength: Double
}

@JsExport
@ExperimentalJsExport
class Arrow : IArrow {
    override val length: Double = 13.0
    override val cropLength: Double = 42.0
}
