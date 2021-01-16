@file:Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")

import kotlin.test.Test
import kotlin.test.assertEquals

@JsName("null")
external interface NullUnion {
    companion object
}

inline val NullUnion.Companion.AAA: NullUnion
    get() = "aaa-null".asDynamic().unsafeCast<NullUnion>()

inline val NullUnion.Companion.BBB: NullUnion
    get() = "bbb-null".asDynamic().unsafeCast<NullUnion>()

inline val NullUnion.Companion.CCC: NullUnion
    get() = "ccc-null".asDynamic().unsafeCast<NullUnion>()


class NullUnionTest {
    @Test
    fun companionMethods() {
        assertEquals("aaa-null", NullUnion.AAA)
        assertEquals("bbb-null", NullUnion.BBB)
        assertEquals("ccc-null", NullUnion.CCC)
    }
}
