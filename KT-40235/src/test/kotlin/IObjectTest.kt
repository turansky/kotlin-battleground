import kotlin.test.Test
import kotlin.test.assertEquals

class IObjectTest {
    @Test
    fun companionMethods() {
        val data = js("{ x: 13, y: 42 }")

        assertEquals(setOf("x", "y"), IObject.keys(data).toSet())
    }
}
