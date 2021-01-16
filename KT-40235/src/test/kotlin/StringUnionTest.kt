@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

import kotlin.test.Test
import kotlin.test.assertEquals

@JsName("String")
external interface StringUnion {
    companion object
}

inline val StringUnion.Companion.AAA: StringUnion
    get() = "aaa-string".asDynamic().unsafeCast<StringUnion>()

inline val StringUnion.Companion.BBB: StringUnion
    get() = "bbb-string".asDynamic().unsafeCast<StringUnion>()

inline val StringUnion.Companion.CCC: StringUnion
    get() = "ccc-string".asDynamic().unsafeCast<StringUnion>()


class StringUnionTest {
    @Test
    fun companionMethods() {
        assertEquals("aaa-string", StringUnion.AAA)
        assertEquals("bbb-string", StringUnion.BBB)
        assertEquals("ccc-string", StringUnion.CCC)
    }
}
