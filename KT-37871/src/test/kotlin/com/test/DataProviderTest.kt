package com.test

import kotlin.test.Test
import kotlin.test.assertEquals

@ExperimentalJsExport
class DataProviderTest {
    @Test
    fun testString() {
        val provider = StringDataProvider("42")

        assertEquals("42", provider.data)
    }

    @Test
    fun testInt() {
        val provider = IntDataProvider(777)

        assertEquals(777, provider.data)
    }
}
