package com.test

class StringDataProvider(data: String) : DataProvider(data) {
    fun doString() {
        println("String")
    }
}

class IntDataProvider(data: Int) : DataProvider(data) {
    fun doInt() {
        println("Int")
    }
}
