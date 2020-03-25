@file:JsModule("yyy")

package com.test.view

open external class Point(
    x: Double,
    y: Double
) {
    val x: Double
    val y: Double
}

@JsExport
@ExperimentalJsExport
class MyPoint(x: Double, y: Double) : Point(2 * x, 2 * y)
