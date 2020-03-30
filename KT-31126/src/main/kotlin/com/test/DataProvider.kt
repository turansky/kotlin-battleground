@file:JsModule("data-provider")

package com.test

open external class DataProvider(data: String) {
    constructor(data: Int)
    constructor(data: Boolean)

    val data: Any
}
