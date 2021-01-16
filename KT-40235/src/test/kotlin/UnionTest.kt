@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

import kotlin.test.Test
import kotlin.test.assertEquals

@JsName("String")
external interface MyUnion {
    companion object
}

inline val MyUnion.Companion.AAA: String
    get() = "aaa"

inline val MyUnion.Companion.BBB: String
    get() = "bbb"

inline val MyUnion.Companion.CCC: String
    get() = "ccc"


class UnionTest {
    @Test
    fun companionMethods() {
        assertEquals("aaa", MyUnion.AAA)
        assertEquals("bbb", MyUnion.BBB)
        assertEquals("ccc", MyUnion.CCC)
    }
}
