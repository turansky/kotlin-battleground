package com.test.view

import com.test.js.Object.Companion.getOwnPropertyDescriptor
import kotlin.test.Test
import kotlin.test.assertFalse

@ExperimentalJsExport
class ArrowTest {
    @Test
    fun lengthIsConfigurable() {
        val prototype: Any = Arrow::class.js.asDynamic().prototype

        assertFalse {
            getOwnPropertyDescriptor(prototype, "length").configurable
        }
    }

    @Test
    fun cropLengthIsConfigurable() {
        val prototype: Any = Arrow::class.js.asDynamic().prototype

        assertFalse {
            getOwnPropertyDescriptor(prototype, "cropLength").configurable
        }
    }
}
