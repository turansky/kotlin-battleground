package com.test

@JsExport
@ExperimentalJsExport
class StringDataProvider(data: String) : DataProvider(data) {
    fun doString() {
        println("String")
    }
}

@JsExport
@ExperimentalJsExport
class IntDataProvider(data: Int) : DataProvider(data) {
    fun doInt() {
        println("Int")
    }
}
