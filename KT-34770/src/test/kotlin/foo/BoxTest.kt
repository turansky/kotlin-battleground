package foo

import kotlin.test.Test
import kotlin.test.assertEquals

class BoxTest {
    @Test
    fun test() {
        assertEquals("OK", box())
    }
}
