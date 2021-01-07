import kotlin.test.Test
import kotlin.test.assertEquals

class IArrayTest {
    @Test
    fun companionMethods() {
        val a = IArray.of(13)
        assertEquals(1, a.length)

        val b = IArray.of(4, 8, 15, 16, 23, 42)
        assertEquals(6, b.length)
    }
}
