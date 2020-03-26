package com.test.app

external fun interface UpdateCallback {
    fun onUpdate()
}

@JsExport
@ExperimentalJsExport
class App {
    fun update(callback: UpdateCallback) {
        callback.onUpdate()
    }

    fun testUpdate() {
        update { println("Start test update!") }
    }
}