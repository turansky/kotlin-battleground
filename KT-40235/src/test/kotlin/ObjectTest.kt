import kotlin.test.Test
import kotlin.test.assertEquals

class ObjectTest {
    @Test
    fun companionMethods() {
        val data = js("{ x: 13, y: 42 }")

        assertEquals(setOf("x", "y"), Object.keys(data).toSet())
    }
}
