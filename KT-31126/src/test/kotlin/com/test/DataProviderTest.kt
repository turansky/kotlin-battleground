package com.test

import kotlin.test.Test
import kotlin.test.assertEquals

class DataProviderTest {
    @Test
    fun primary() {
        val provider = DataProvider("13")

        assertEquals("13", provider.data)
    }
}
