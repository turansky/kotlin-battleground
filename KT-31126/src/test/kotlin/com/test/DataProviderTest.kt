package com.test

import kotlin.test.Test
import kotlin.test.assertEquals

@ExperimentalJsExport
class DataProviderTest {
    @Test
    fun externalPrimary() {
        val provider = DataProvider("13")

        assertEquals("13", provider.data)
    }

    @Test
    fun primaryToPrimary() {
        val provider = StringDataProvider("42")

        assertEquals("42", provider.data)
    }

    @Test
    fun primaryToSecondary() {
        val provider = IntDataProvider(777)

        assertEquals(777, provider.data)
    }
}
