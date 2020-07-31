package com.test.app

external interface UpdateCallback {
    fun onUpdate()
}

@JsExport
@ExperimentalJsExport
class App {
    fun update(callback: UpdateCallback) {
        callback.onUpdate()
    }

    fun testUpdate() {
        println("testUpdate!!!")
        // update { println("Start test update!") }
    }
}
