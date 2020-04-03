package com.test.app

fun interface UpdateCallback {
    fun onUpdate()
}

class App {
    fun update(callback: UpdateCallback) {
        callback.onUpdate()
    }

    fun testUpdate() {
        update { println("Start test update!") }
    }
}
