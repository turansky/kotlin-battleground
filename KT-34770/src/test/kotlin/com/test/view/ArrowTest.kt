package com.test.view

import com.test.js.Object.Companion.getOwnPropertyDescriptor
import kotlin.test.Test
import kotlin.test.assertTrue

class ArrowTest {
    @Test
    fun lengthIsConfigurable() {
        val prototype: Any = Arrow::class.js.asDynamic().prototype

        assertTrue {
            getOwnPropertyDescriptor(prototype, "length").configurable
        }
    }

    @Test
    fun cropLengthIsConfigurable() {
        val prototype: Any = Arrow::class.js.asDynamic().prototype

        assertTrue {
            getOwnPropertyDescriptor(prototype, "cropLength").configurable
        }
    }
}
